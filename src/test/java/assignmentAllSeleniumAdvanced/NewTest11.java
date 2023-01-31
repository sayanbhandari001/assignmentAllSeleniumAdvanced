package assignmentAllSeleniumAdvanced;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.apache.poi.hpsf.Date;
//import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.dp.MyDataClass;
//import com.page.LoginPage;
//import com.page.RegisterPage;

public class NewTest11 {
    WebDriver driver = DriverUtility.getBrowser("chrome");
    ExtentSparkReporter reporter;
    ExtentReports reports;
    ExtentTest logger;
    String regi;
    @BeforeTest
    public void startTest()
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-mm");
        String path=System.getProperty("user.dir")+"/extent-report1/"+sdf.format(new Date())+".html";
        reporter= new ExtentSparkReporter(path);
        reports= new ExtentReports();
        reports.attachReporter(reporter);

        //reports.setSystemInfo("hostname", "local host");
        //reports.setSystemInfo("Environment", "Testing Env");
        //reports.setSystemInfo("Username", "Kannan Ramalingam");

        reporter.config().setReportName("My Report");
        reporter.config().setTheme(Theme.DARK);
    }

    @AfterTest
    public void endTest()
    {
        reports.flush();
    }
    @AfterClass
    public void endTest1()
    {
        driver.close();
    }

    @AfterMethod
    public void captureStatus(ITestResult result)
    {
        if(result.getStatus()==ITestResult.SUCCESS)
        {
            logger.log(Status.PASS, result.getMethod().getMethodName()+" test is passed");
        }
        else if(result.getStatus()==ITestResult.FAILURE)
        {
            String imagePath=System.getProperty("user.dir")+"/extent-report1/capture/"+result.getMethod().getMethodName()+". png";
                    logger.log(Status.FAIL, result.getMethod().getMethodName()+" test is failed");
                    TakesScreenshot sc=(TakesScreenshot) driver;
                    File src=sc.getScreenshotAs(OutputType. FILE) ;
                    try {
                    FileUtils.copyFile(src, new File(imagePath));
                    logger .addScreenCaptureFromPath(imagePath) ;
                    } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    }
        }
    }

    @Test(dataProvider = "myTestData1" , dataProviderClass = MyDataClass.class)
    public void Register(String a,String b,String email,String password) throws InterruptedException{
         logger=reports.createTest("Registration Test");
         driver.manage().window().maximize();
         driver.get("http://demowebshop.tricentis.com/");
         RegisterPage Reg = PageFactory.initElements(driver, RegisterPage.class);
         Reg.Register.click();
         Reg.gender.click();
         Reg.FirstName.sendKeys(a);
         Reg.LastName.sendKeys(b);
         Reg.Email.sendKeys(email);
         Reg.Password.sendKeys(password);
         Reg.ConfirmPassword.sendKeys(password);
         System.out.println("Registered");
         Reg.registerbutton.click();
         Thread.sleep(6000);     
         //Thread.sleep(6000);
         regi=driver.findElement(By.className("account")).getText();
         Assert.assertEquals(regi, email);
         //Reg.Logout.click();
         //driver.close();

  }
  @Test(dataProvider = "myTestData" , dataProviderClass = MyDataClass.class)
  public void login(String email,String password) {
      logger=reports.createTest("Login Test");
      LoginPage Login = PageFactory.initElements(driver, LoginPage.class);
      if(regi==email)
      {
      Login.Logout.click();
      }
      Login.loginab.click();
      Login.email.sendKeys(email);
      Login.password.sendKeys(password);
      Login.loginbutton.click();
      String acc=driver.findElement(By.className("account")).getText(); 
      Assert.assertEquals(acc, email);

  }

}