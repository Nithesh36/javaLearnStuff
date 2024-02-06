package readWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 
		 * why: property file Needed
		 * 
		 * to store Dynamically changed values
		 */

		FileInputStream reder = new FileInputStream(
				new File(System.getProperty("user.dir")+"/src/main/java/resources/config.properties"));
		Properties prop = new Properties();
		
		prop.load(reder);
		prop.setProperty("url", "google.com");
		
		System.out.println(prop.getProperty("Browser"));
	}

}
