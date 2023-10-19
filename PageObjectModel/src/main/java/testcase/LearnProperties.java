package testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {

	public static void main(String[] args) throws IOException {

		// instantiate the properties class
		Properties property = new Properties();

		// setup the property file path
		FileInputStream fis = new FileInputStream(new File("./src/main/resources/config.properties"));

		// load the file to property
		property.load(fis);

		String url = property.getProperty("url");
		System.out.println(url);
		String username = property.getProperty("username");
		System.out.println(username);
		String password = property.getProperty("password");
		System.out.println(password);
	}

}
