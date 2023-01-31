package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.utility.BrowserUtility;

public class TestNG_manualcheck {
	WebDriver driver=BrowserUtility.supplyDriver("chrome");
	
	@Test
	public void openBrowser()
	{
		//WebDriverManager.chromedriver().setup();
	    //WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		Actions act= new Actions(driver);
		WebElement aboutus=driver.findElement(By.xpath("//span[contains(text(), 'AboutUs')]"));
		act.moveToElement(aboutus).perform();
		WebElement ourOffice=driver.findElement(By.xpath("//span[contains(text(), 'Our')]"));
		act.moveToElement(ourOffice).perform();
		WebElement chennaiLocation=driver.findElement(By.xpath("//span[contains(text(), 'Chennai')]"));
		act.moveToElement(chennaiLocation).click().perform();
		
		//Window handle
		
		Set<String> allWindowAddr=driver.getWindowHandles();
		  for(String a:allWindowAddr)
		  {
			  driver.switchTo().window(a);
		  }
		  driver.switchTo().frame(1);
//		  String actual = ("Testme Inc.\r\n"
//		  		+ "\r\n"
//		  		+ "123, Velachery Main Road\r\n"
//		  		+ "\r\n"
//		  		+ "Chennai, India\r\n"
//		  		+ "\r\n"
//		  		+ "Mobile: +91 9898912345\r\n"
//		  		+ "\r\n"
//		  		+ "Fax: 84554323\r\n"
//		  		+ "\r\n"
//		  		+ "Email: info@testmeapp.com");
		  String expected=driver.findElement(By.xpath("//*[@id='demo3']")).getText();
		  System.out.println(expected);
		  Assert.assertTrue(expected.contains("Chennai"));
		  
	}
}
