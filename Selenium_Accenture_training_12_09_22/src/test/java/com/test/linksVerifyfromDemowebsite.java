package com.test;

import org.testng.annotations.Test;

import com.utility.BrowserUtility;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class linksVerifyfromDemowebsite {
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		driver=BrowserUtility.supplyDriver("chrome");
		driver.manage().window().maximize();
		
	  }
	
	@Test(priority=1)
  public void Linksverify() {
//		WebElement informationURLS = driver.findElement(By.xpath("//h3[text()='Information']"));
//		informationURLS.findElements(By.linkText(null));
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> allLinks = driver.findElements(By.cssSelector("div[class='column information']"));
		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
	}

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
