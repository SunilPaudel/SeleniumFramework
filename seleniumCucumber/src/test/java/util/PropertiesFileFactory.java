package util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileFactory {
	
	private static Properties prop = buildProperties();
	
	private static Properties buildProperties() {
		
		try {
			
			prop = new Properties();
			
			InputStream input = new FileInputStream("src/test/resources/config.properties");
			
			prop.load(input);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return prop;
	}
	
	
	public static String getPropertyValue(String key) {
		
		return prop.getProperty(key);
		
	}

}
