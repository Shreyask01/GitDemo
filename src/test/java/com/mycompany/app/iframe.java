package com.mycompany.app;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class iframe {

	
	@Test
	public void iframe() throws IOException
	{
		
		base b= new base();
	    
		WebDriver driver = b.initiatedriver();
		
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/");
		
		
		
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		WebElement frame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[3]/p/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("abc"); 
		
	}
}
