import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		ObjectMapper mapper = new ObjectMapper();

		Employee testMappee;
		testMappee = mapper.readValue(new File("C:/Users/dnelson/IdeaProjects/shafeen-test/src/main/resources/employee.json"), Employee.class);
		System.out.println(mapper.writeValueAsString(testMappee));
	}
}