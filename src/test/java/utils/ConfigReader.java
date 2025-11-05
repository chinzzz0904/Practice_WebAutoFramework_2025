package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public void loadProperties() {

		try {

			prop = new Properties();

			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/resourceFiles/config.properties");

			prop.load(fis);

			fis.close();

		} catch (IOException e) {
			
			System.out.println("Failed to load config.properties: " + e.getMessage());
		}

	}

	public String getProperty(String key) {

		return prop.getProperty(key);
	}
}