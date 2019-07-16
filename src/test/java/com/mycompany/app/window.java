package com.mycompany.app;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class window {

	
	@Test
	public void windowhandle() throws IOException
	{
	base b = new base();
	WebDriver driver = b.initiatedriver();
	driver.get(b.url());
	
	//click on windows and frames tab
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.id("menu-item-2822"))).build().perform();
	a.moveToElement(driver.findElement(By.id("menu-item-2823"))).build().perform();	
	a.moveToElement(driver.findElement(By.id("menu-item-2999"))).click().build().perform();		
	
	//click on open new tab
	driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/a")).click();
	
	//open into new window
	
	Set<String> ids = driver.getWindowHandles();
	Iterator<String> it = ids.iterator();
	String parentid = it.next();
	String childid = it.next();
	
	driver.switchTo().window(parentid);
	driver.findElement(By.cssSelector("li#iFrame")).click();
	driver.switchTo().defaultContent();
	
	//Swich to frame
	WebElement frame = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
	driver.switchTo().frame(frame);
	driver.findElement(By.id("menu-item-1921")).click();
	
	
	
}
	
	
	
}
