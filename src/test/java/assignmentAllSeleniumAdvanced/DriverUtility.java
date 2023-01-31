package assignmentAllSeleniumAdvanced;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtility {
	 public static WebDriver getBrowser(String browser)
	    {
	        if(browser.equals("chrome"))
	        {
	            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayan.bhandari\\Downloads\\Sayan\\Sayan\\selenium-java-4.1.0\\chromedriver.exe");
	            WebDriverManager.chromedriver().setup();
	        	return new ChromeDriver();
	        }
	        else if(browser.equals("firefox"))
	        {
	            //System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\driverfiles\\file1.exe");
	            WebDriverManager.firefoxdriver().setup();
	            return new FirefoxDriver();
	        }
	        else if(browser.equals("ie"))
	        {
	            //System.setProperty("webdriver.ie.driver", "src\\test\\resources\\driverfiles\\file2.exe");
	            return new InternetExplorerDriver();
	        }
	        else
	        {
	            return null;
	        }
	        
	    }
}
