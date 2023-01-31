package com.test;

import org.testng.annotations.Test;

import com.utility.BrowserUtility;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class dataExcelFilter {
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
//		  driver=BrowserUtility.supplyDriver("chrome");
//		  driver.manage().window().maximize();
//		  driver.get("");
		  System.out.println("Hi");
		}
	
  @Test
  public void readExcelVerifydataWriteExcel()  throws Exception  {
	  //Wait
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  
	  //Create an object of File class to open xls file
      File file =    new File("C\\excel\\readWriteData.xls");
      
      //Create an object of FileInputStream class to read excel file
      FileInputStream inputStream = new FileInputStream(file);
      
      //creating workbook instance that refers to .xls file
      HSSFWorkbook wb=new HSSFWorkbook(inputStream);
      
      //creating a Sheet object
      HSSFSheet sheet=wb.getSheet("");
      
      //get all rows in the sheet
      int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
      
     //Creating an object of ChromeDriver
      driver=BrowserUtility.supplyDriver("chrome");
      
      //Navigate to the URL
      driver.get("");


      //Identify the WebElements for the student registration form
      WebElement firstName=driver.findElement(By.id("firstName"));
      
      WebElement submitBtn=driver.findElement(By.id("submit"));



      //iterate over all the rows in Excel and put data in the form.
      for(int i=1;i<=rowCount;i++) {
          //Enter the values read from Excel in firstname,lastname,mobile,email,address
          firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
          
          
          //Click on submit button
          submitBtn.click();
          
          //Verify the confirmation message
          WebElement confirmationMessage = driver.findElement(By.xpath(""));
          
          //create a new cell in the row at index 6
          HSSFCell cell = sheet.getRow(i).createCell(6);
          
          //check if confirmation message is displayed
          if (confirmationMessage.isDisplayed()) {
              // if the message is displayed , write PASS in the excel sheet
              cell.setCellValue("PASS");
              
          } else{
              //if the message is not displayed , write FAIL in the excel sheet
              cell.setCellValue("FAIL");
          }         
          
          // Write the data back in the Excel file
          FileOutputStream outputStream = new FileOutputStream("C\\excel\\readWriteData.xls");
          wb.write(outputStream);

          //go back to same page
          
          
          //wait for page to come back to registration page after close button is clicked
          
      }
      
      //Close the workbook
      wb.close();
  }
  

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}
