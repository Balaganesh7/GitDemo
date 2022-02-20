package Pck1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Globalconfig {

	public static void main(String[] args) throws Exception 
	{		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\eshga\\eclipse-workspace\\Class1\\config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

		//To update value in config.properties file - SETPROPERTY METHOD
		prop.setProperty("url", "https://www.google.com/");
		
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\eshga\\\\eclipse-workspace\\\\Class1\\\\config.properties");
		prop.store(fos, null);
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\eshga\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000L);		
		driver.quit();
	}

}
