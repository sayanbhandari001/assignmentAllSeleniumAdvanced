package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utility.BrowserUtility;

public class Task2_DragAndDropToBucket {

WebDriver driver=BrowserUtility.supplyDriver("chrome");
	
	@Test
	public void openBrowser() throws InterruptedException
	{
		
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
		Thread.sleep(7000);
		//driver.findElement(By.xpath("//button[text() ='Accept Cookies']")).submit();
		Actions act = new Actions(driver);
		WebElement Pickup=driver.findElement(By.xpath("//span[text() = 'Weekend Package']"));
		//Pickup.click();
		WebElement Drop=driver.findElement(By.xpath("//*[@class='price-checker']//div"));
		act.dragAndDrop(Pickup, Drop);
		Thread.sleep(7000);
		String Valuematching=driver.findElement(By.xpath("//*[@class='price-checker']//div[2]//span")).getText();
		System.out.println(Valuematching);
		//Assert.assertTrue(Valuematching.contains("$3999"));
		 
		
		
		//     To be complete
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}