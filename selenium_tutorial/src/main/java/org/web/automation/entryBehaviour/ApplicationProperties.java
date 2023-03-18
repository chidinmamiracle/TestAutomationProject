package org.web.automation.entryBehaviour;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ApplicationProperties {
	
	public static String appPro(String key){
		try
	{
		File f = new File("./ConfigurationFiles/ConfigApplication.Properties");
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();//This will be return to string becos String class overrides the equal method and offers content equality which basically uses characters, case, and order.
		
	} catch (Exception e) {
		return null;
	}
	}
	
	public static String elementlocator(String key){
		try 
	{
		File f = new File("./ElementLocatorFile/Locator.properties");
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	
	}catch (Exception e) {
		return null;
	}
		
	}

}
