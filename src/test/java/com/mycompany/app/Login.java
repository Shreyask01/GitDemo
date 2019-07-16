package com.mycompany.app;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Login {
	
	
	
	@Test
	public void login() throws IOException
	{
		
	
	    base b= new base();
	    
		WebDriver driver = b.initiatedriver();
	
		driver.get("http://www.globalsqa.com/samplepagetest");
 
}
}