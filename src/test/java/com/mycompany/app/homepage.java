package com.mycompany.app;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mycompany.app.Home;


public class homepage extends base {
	
	@Test(dataProvider="getdata")
	public void home(String user, String pwd) throws IOException
	{
		 base b= new base();
		    
		WebDriver driver = b.initiatedriver();
		
		String url = b.url();
		driver.get(url);
		
		Home h = new Home(driver);   
		Actions a = new Actions(driver);
		WebElement e = h.testerhub();
		a.moveToElement(e).build().perform();
		h.form().click();
	    //.file().sendKeys(file);
		h.name().sendKeys(user);
		h.email().sendKeys(pwd);
		//h.website().sendKeys("www.globalsqa.com");
		
		
		Select sc = new Select(h.exp());
		sc.selectByIndex(2);
		
		h.ftest().click();
		
		h.postgrad().click();
		
		h.textarea().sendKeys("ABsukhakshdkhas"); 
		h.submit().click();
		
	}
		
		@DataProvider
		public Object[][] getdata()
		{
			Object data[][] = new Object[2][2];
			
			
			//data[0][0] ="C:\\Users\\shreyas.kolambakar\\file.txt";
			data[0][0]="ramesh";
			data[0][1]="pwd";
			
			
	
		    //ata[1][0] ="C:\\Users\\shreyas.kolambakar\\file2.txt";
			data[1][0]="suresh";
			data[1][1]="pwd";
			
			return data;
			
		
			
		}
	
    @AfterTest
	public void close()
	{
		driver.close();
		
	}

   

   
}
