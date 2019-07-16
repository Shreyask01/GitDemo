package com.mycompany.app;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class alert {
	
	
	
	
	@Test
	public void dialogue() throws IOException
	{
		base b= new base();
		alertData a=new alertData();
	    
		WebDriver driver = b.initiatedriver();	
		driver.get("http://www.globalsqa.com/demo-site/dialog-boxes/#Form");
		WebElement frame= driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div/p/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[@id='create-user']")).click();
		//driver.switchTo().alert();
		
		a.name(driver).clear();
		a.name(driver).sendKeys("john");
		//driver.findElement(By.xpath("//input[@id='name']")).clear();
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("john@smith.com");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass111");
		driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button[1]")).click();
	}
}
