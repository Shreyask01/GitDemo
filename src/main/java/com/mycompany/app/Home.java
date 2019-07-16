package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home {

	public Home(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	WebDriver driver;
	
     By testerhub = By.xpath("//li[@id='menu-item-2822']");
     By form = By.xpath("//li[@id='menu-item-2846']");
    
    // SAmple page form
    
    //By file = By.xpath("//input[@type='file']");
    
    //another way to declare webelement 
    @FindBy(xpath="//input[@type='file']")
    WebElement file;
    
    
	//By name = By.xpath("//input[@id='g2599-name']");
    
    @FindBy(xpath="//input[@id='g2599-name']") 
    WebElement name;
    
    
	By email = By.xpath("//input[@id='g2599-email']");
	By website =By.xpath("g2599-website");
	By exp = By.xpath("//select[@id='g2599-experienceinyears']");
	
	//expertise
	By ftest = By.xpath("//input[@value='Functional Testing']");
	By automation = By.xpath("//input[@value='Automation Testing']"); 
	By manual = By.xpath("//input[@value='Manual Testing']");
	
	//Education
	By grad = By.xpath("//input[@value='Graduate']");
	By postgrad = By.xpath("//input[@value='Post Graduate']");
	By other = By.xpath("//input[@value='other']");
	By textarea = By.xpath("//textarea[@class='textarea']");
	By submit = By.xpath("//input[@class='pushbutton-wide']");
	
	
	public WebElement testerhub()
	{
	return driver.findElement(testerhub);
	}
	

	public WebElement form()
	{
	 return driver.findElement(form);
	}
	
	public WebElement file()
	{
	 return file;
	}
	
	public WebElement name()
	{
	 return name;
	}
	public WebElement email()
	{
	 return driver.findElement(email);
	}
	
	public WebElement website()
	{
	 return driver.findElement(website);
	}
	
	public WebElement exp()
	{
	 return driver.findElement(exp);
	}
	public WebElement ftest()
	{
	 return driver.findElement(ftest);
	}
	
	public WebElement automation()
	{
	 return driver.findElement(automation);
	}
	
	public WebElement manual()
	{
	 return driver.findElement(manual);
	}
	
	
	public WebElement drad()
	{
	 return driver.findElement(grad);
	}
	
	public WebElement postgrad()
	{
	 return driver.findElement(postgrad);
	}
	
	public WebElement other()
	{
	 return driver.findElement(other);
	}
	
	public WebElement textarea()
	{
	 return driver.findElement(textarea);
	}
	
	
	public WebElement submit()
	{
	 return driver.findElement(submit);
	}
	
	
	
}


