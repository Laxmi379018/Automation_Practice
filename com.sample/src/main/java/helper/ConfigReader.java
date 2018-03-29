package helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties pro;
	public ConfigReader()
	{
		try {
			File src = new File("Configuration\\config.properties");
			
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is =="+e.getMessage());
	
	

		}
	}
	
public String getURL()
	
	{

		return pro.getProperty("URL");		
	}

public String getBrowser()

	{		
		return pro.getProperty("BrowserName");
	}
	
public String getEmailID()

{

	return pro.getProperty("EmailID");
	
}
public String getUserID()
	
	{

		return pro.getProperty("UserID");
		
	}

public String getUserPassword()

	{

		return pro.getProperty("Password");
		
	}


}
