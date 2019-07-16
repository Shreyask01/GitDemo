package com.mycompany.app;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class alertData{

	
	public WebDriver driver;

	public WebDriver data() throws IOException
	{
	base b= new base();
    
	WebDriver driver = b.initiatedriver();
	
	return driver;
	}
	
	By name = By.xpath("//input[@id='name']");
	By email = By.xpath("//input[@id='email']");
	By pass = By.xpath("//input[@id='password']");
	By button = By.xpath("//div[@class='ui-dialog-buttonset']/button[1]");
	
	
	public WebElement name(WebDriver driver)
	{
		return driver.findElement(name);
	}
	public WebElement email(WebDriver driver)
	{
		return driver.findElement(email);
	}
	public WebElement pass(WebDriver driver)
	{
		return driver.findElement(pass);
	}
	public WebElement button(WebDriver driver)
	{
		return driver.findElement(button);
	}
	
	
}
