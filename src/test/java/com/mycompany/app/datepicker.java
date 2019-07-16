package com.mycompany.app;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class datepicker {

	
	@Test
	public void date() throws IOException, InterruptedException
	{
		
		base b= new base();
	    
		WebDriver driver = b.initiatedriver();
		driver.get("http://www.globalsqa.com/demo-site/datepicker/");
		
		driver.findElement(By.xpath("//li[@id='Icon Trigger']")).click();
		WebElement frame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[3]/p/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		
		
		for(int i=0;i<=5;i++)
		{
			driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']/span")).click();
			
		}
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[5]/a")).click();
      }
	
	
	
	@Test
	public void date2() throws IOException
	{
        base b= new base();
	    
		WebDriver driver = b.initiatedriver();
		driver.get("http://www.globalsqa.com/demo-site/datepicker/");
		driver.findElement(By.xpath("//li[@id='DropDown DatePicker']")).click();
		WebElement frame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[2]/p/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		Select s = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		s.selectByIndex(5);
	}
	
	
}
