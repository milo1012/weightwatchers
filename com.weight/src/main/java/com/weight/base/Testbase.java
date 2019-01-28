package com.weight.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	public static  WebDriver driver;
	public  static Properties prop;
	
	public Testbase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\sharm\\eclipse-workspace\\com.weight\\src\\main\\java\\com\\weight\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


      public static void initialization1() {
    	  String browsername = prop.getProperty("browser");
    	  
    	  
    	
    		  System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe\\");
    		driver = new ChromeDriver();
    	 
	

    	  driver.manage().window().maximize();
    	  driver.manage().deleteAllCookies();
    	  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    	  
    	  
    	  driver.get(prop.getProperty("url"));
    	  
    	  
      }
}
