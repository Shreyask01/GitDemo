package com.mycompany.app;

import java.io.IOException;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.testng.annotations.Test;

public class draganddrop {

	
	@Test
	public void drag() throws IOException, InterruptedException
	{
		base b = new base();
		WebDriver driver = b.initiatedriver();
		
		driver.get(b.url());
		
		//click on Drag and Drop tab
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("menu-item-2822"))).build().perform();
		a.moveToElement(driver.findElement(By.id("menu-item-2823"))).build().perform();	
		a.moveToElement(driver.findElement(By.id("menu-item-2829"))).click().build().perform();	
		
		driver.findElement(By.xpath("//ul[@class='resp-tabs-list ']/li[2]")).click();
		WebElement frame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[2]/p/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElement(By.cssSelector("div#draggable"));
		WebElement target = driver.findElement(By.cssSelector("div#droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("menu-item-2804")).click();;
		
		}
	
	
	    @Test
	    public void select() throws IOException
	    {
	     base b = new base();
	     WebDriver driver = b.initiatedriver();
	     driver.get("http://www.globalsqa.com/demo-site/select-elements/#Multiple%20Selection");
	     
	     WebElement frame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
	     driver.switchTo().frame(frame);
	     Actions a = new Actions(driver);
	     
	     //a.moveToElement(driver.findElement(By.xpath("//ol[@id='selectable']/li[1]"));
	    		 
	    
	     driver.findElement(By.xpath("//ol[@id='selectable']/li[1]")).click();
	     a.keyDown(Keys.CONTROL).build().perform();;
	     driver.findElement(By.xpath("//ol[@id='selectable']/li[3]")).click();
	     driver.findElement(By.xpath("//ol[@id='selectable']/li[4]")).click();
	     
	     a.keyUp(Keys.CONTROL).build().perform();
	    		 
	    		 
	    }
}
