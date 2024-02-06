package readWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritetoPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Create a FileOutputStream to write to the property file
        FileOutputStream fileOutputStream = new FileOutputStream(
        		
        		System.getProperty("user.dir")+"/src/main/java/resources/config.properties",true);
        Properties prop=new Properties();
        prop.setProperty("LoginID", "NK");
        prop.setProperty("env", "uat");
        // Store the properties into the file
        prop.store(fileOutputStream, "Updated properties env");
        System.out.println("done");
	}

}
