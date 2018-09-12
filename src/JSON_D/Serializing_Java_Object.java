package JSON_D;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializing_Java_Object{
	
	// Serializing Java Objects to JSON
	
	public static void main(String args[]) throws IOException
	{
Address johnDoeAddress = new Address("100 Elm Way", "Foo City", "NJ", "01234");
Person johnDoe = new Person("John", "Doe", null, 29, true, johnDoeAddress);
ObjectMapper mapper = new ObjectMapper();
String json = mapper.writeValueAsString(johnDoe);
System.out.println(json);
}
}
