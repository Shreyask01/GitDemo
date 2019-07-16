package com.mycompany.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class base {
	public WebDriver driver;
	
	
	
	
	public WebDriver initiatedriver() throws IOException
	{
    
	Properties prop = new Properties();
	FileInputStream fs = new FileInputStream("C:\\Users\\shreyas.kolambakar\\Desktop\\my-app\\src\\main\\java\\data.properties");	
	prop.load(fs);
	String browsername= prop.getProperty("browser");
	
	System.out.println(browsername);
	
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shreyas.kolambakar\\Documents\\Selenium resource\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shreyas.kolambakar\\Documents\\Selenium resource\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	return driver;
	
	
	}
	
	public String url() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("C:\\Users\\shreyas.kolambakar\\Desktop\\my-app\\src\\main\\java\\data.properties");
		prop.load(fs);
		String url=prop.getProperty("url");
		return url;
	}
	

	
	
	}
	