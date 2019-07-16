package com.mycompany.app;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class selectmulti {
	
	
	/**
	@Test
	public void select() throws IOException
	{
		base b = new base();
		WebDriver driver = b.initiatedriver();
		//String url = b.url();
		driver.get("http://www.globalsqa.com/demo-site/select-elements/");
		
		driver.findElement(By.xpath("//li[@id='Multiple Selection']")).click();
		
		WebElement frame = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']/p/iframe"));
		driver.switchTo().frame(frame);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.LEFT_CONTROL)
		    .click(driver.findElement(By.xpath("//ol[@id='selectable']/li[1]")))
		    .click(driver.findElement(By.xpath("//ol[@id='selectable']/li[2]")))
		    .click(driver.findElement(By.xpath("//ol[@id='selectable']/li[3]")))
		    .build()
		    .perform();
	 }

	**/
	@Test
	public void grid() throws IOException
	{
	  base b =new base();
	  WebDriver driver = b.initiatedriver();
	  
	  driver.get("http://www.globalsqa.com/demo-site/select-elements/");
	  
	  driver.findElement(By.xpath("//li[@id='Grid Selection']")).click();
	  
	  WebElement frame = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']/p/iframe"));
	  driver.switchTo().frame(frame);
	  
	  Actions actions = new Actions(driver);
		actions.keyDown(Keys.LEFT_CONTROL)
		    .click(driver.findElement(By.xpath("//ol[@id='selectable']/li[1]")))
		    .click(driver.findElement(By.xpath("//ol[@id='selectable']/li[2]")))
		    .click(driver.findElement(By.xpath("//ol[@id='selectable']/li[3]")))
		    .build()
		    .perform();
		
	}
	
}
