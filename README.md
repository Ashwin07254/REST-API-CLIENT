# REST-API-CLIENT
Company:CODTECH IT SOLUTION

Name:Ashwin Pradeep Pai

Intern Id:CT04DG64

Domain:Java Programming

Duration:4 Week

Mentor:NEELA SANTOSH

Output:



![Image](https://github.com/user-attachments/assets/eece2e01-396d-4950-ba0e-c7ae4a646ba7)


Description:
This Java application is a simple yet effective example of a REST API client that interacts with a public weather API, namely OpenWeatherMap, to fetch and display current weather data for a user-specified city. The primary functionality of this program lies in its ability to make an HTTP GET request to a RESTful web service, receive the response in JSON format, parse that JSON data, and display meaningful information to the user in a structured and readable format. It demonstrates core concepts of REST API consumption in Java such as building URL strings, sending HTTP requests using the HttpURLConnection class, reading server responses using BufferedReader, and parsing JSON using the org.json library.
At the beginning of the program, the user is prompted to enter a city name through standard input. The program then dynamically constructs a request URL by appending the city name and a predefined API key to the OpenWeatherMap endpoint. It also specifies that the units for temperature should be in metric format. Once the URL is built, a connection is established using the HttpURLConnection class, and the HTTP method is set to GET, which is standard for data retrieval in RESTful services. The program then opens an input stream to read the API response. Since the data returned is in JSON format, it is read line by line and appended into a StringBuilder object to form a complete JSON string.
After closing the stream and disconnecting the HTTP connection, the JSON response is parsed using the JSONObject class from the org.json library. The application extracts specific data fields from the JSON structure: the city name (name), temperature (main.temp), humidity (main.humidity), and weather description (weather[0].description). This information is then printed to the console in a clean and user-friendly format. If any errors occur during this process, such as an invalid city name or network issues, the exception handling block catches the error and prints an appropriate message to the user without crashing the application.
