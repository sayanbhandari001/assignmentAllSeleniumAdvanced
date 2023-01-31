package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class FileInutStream {
  @Test
  public void readExcelData() {
      /*1. Identify the file(Path and file name)
       *2. Create a connection(stream) between file and program
       *3. Perform I/O operations
       *4. Close the connection
       */
      
      String filePath="C:\\My Data\\Test Data\\Login.xlsx";
      File file=new File(filePath);
      try {
        InputStream is=new FileInputStream(file);
        XSSFWorkbook workbook=new XSSFWorkbook(is);
        XSSFSheet sheet1=workbook.getSheet("Sheet1");
        for(int i=1;i<=sheet1.getLastRowNum();i++)
        {
            System.out.println("Email:"+sheet1.getRow(i).getCell(0).getStringCellValue());
            System.out.println("Password:"+sheet1.getRow(i).getCell(1).getStringCellValue());
        }
            } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
      
  }
}