package com.mycompany.app;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTest{

	
	
	WebDriver driver = null;
	
	@BeforeSuite
	public void setPropert()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shreyas.kolambakar\\Documents\\Selenium resource\\chromedriver_win32\\chromedriver.exe");
		
	}
	
	@BeforeTest
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.globalsqa.com/samplepagetest/");
		
	}
	
	
	@Test
	public void form() throws IOException
	{
		
         
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.globalsqa.com/samplepagetest/");
	
		
		
		
		WebElement element = driver.findElement(By.xpath("//li[@id='menu-item-2822']/a"));
		Actions action = new Actions(driver);
		
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//li[@id='menu-item-2846']/a")).click();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\shreyas.kolambakar\\Desktop\\file.txt");
        
        
        
       	driver.findElement(By.xpath("//input[@class='name']")).sendKeys("abc");
       	driver.findElement(By.xpath("//input[@class='email']")).sendKeys("ab@gmail.com");
       	driver.findElement(By.xpath("//input[@class='url']")).sendKeys("ab@gmail.com");	
		Select exp = new Select(driver.findElement(By.xpath("//select[@class='select']")));
		exp.selectByVisibleText("3-5");
		driver.findElement(By.xpath("//input[@value='Functional Testing']")).click();
		driver.findElement(By.xpath("//input[@value='Graduate']")).click();
		driver.findElement(By.xpath("//*[text()='Alert Box : Click Here']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//textarea[@class='textarea']")).sendKeys("this is Textarea");
		driver.findElement(By.xpath("//input[@class='pushbutton-wide']")).click(); 
	}
	
}
