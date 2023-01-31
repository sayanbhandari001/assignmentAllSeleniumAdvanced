package com.test;

import org.testng.annotations.Test;

import com.utility.BrowserUtility;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;

	@Test
	public void gmailDeleteSocialDetails() {
		WebElement emailLogin = driver.findElement(By.cssSelector("input[type=email]"));
		emailLogin.clear();
		emailLogin.sendKeys("sayanbhandari007@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']"));

	}

	@BeforeTest
	public void beforeTest() {
		driver = BrowserUtility.supplyDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
	}

	@AfterTest
	public void afterTest() {
		// driver.close();
	}

}
