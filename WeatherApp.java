import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;
public class WeatherApp {
	private static final String API_KEY="48f188a9dafa85be7666a1b04fb6827d";
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the city name:");
		String city=scanner.nextLine().trim();
		String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" 
                + city + "&appid=" + API_KEY + "&units=metric";

	    try
		{
			URL url=new URL(urlString);
			HttpURLConnection conn=(HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuilder content=new StringBuilder();
			while((inputLine=in.readLine())!=null)
			{
				content.append(inputLine);
			}
			in.close();
			conn.disconnect();
			JSONObject json=new JSONObject(content.toString());
			String cityName=json.getString("name");
			JSONObject main=json.getJSONObject("main");
			double temperature=main.getDouble("temp");
			int humidity=main.getInt("humidity");
			
			JSONObject weather=json.getJSONArray("weather").getJSONObject(0);
			String description=weather.getString("description");
			
		    System.out.println("\nWeather Report for:"+cityName);
		    System.out.println("-----------------------------");
		    System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Humidity   : " + humidity + "%");
            System.out.println("Condition  : " + description);
            
            
			
		}catch(Exception e)
		{
			System.out.println("Could not Retrieve the message Pls try again later");
			System.out.println("Error:"+e.getMessage());
		}
		scanner.close();
	}

}
