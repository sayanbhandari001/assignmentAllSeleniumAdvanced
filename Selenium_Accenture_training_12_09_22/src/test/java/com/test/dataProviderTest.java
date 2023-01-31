package com.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.utility.BrowserUtility;

public class dataProviderTest {
    WebDriver driver;
  @Test(dataProvider = "myTestData",dataProviderClass =MyTestData.class )
  public void testLogin(String email,String password) {
      driver.findElement(By.id("Email")).sendKeys(email);
      driver.findElement(By.id("Password")).sendKeys(password);
      driver.findElement(By.cssSelector("input[value='Log in']")).click();
      String s1=driver.findElement(By.className("account")).getText();
      if(s1.equals(email))
      {
          driver.findElement(By.linkText("Log out")).click();
          driver.findElement(By.linkText("Log in")).click();
          Assert.assertTrue(true);
      }
      else
      {
    	  driver.findElement(By.id("Email")).clear();
          driver.findElement(By.id("Password")).clear();
          Assert.assertTrue(false);
      }
      
  }
  @BeforeTest
  public void beforeTest() {
      driver=BrowserUtility.supplyDriver("chrome");
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/login");
   }
  
 @AfterTest
  public void afterTest() {
      driver.close();
  }



}