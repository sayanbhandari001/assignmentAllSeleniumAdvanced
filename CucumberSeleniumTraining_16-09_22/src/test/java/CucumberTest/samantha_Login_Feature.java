package CucumberTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.BrowserUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class samantha_Login_Feature {
	
	WebDriver driver;
	
	@Before
	public void openBrowser()
	{
			driver=BrowserUtility.supplyDriver("chrome");
			driver.manage().window().maximize();
	}
	
	@Given("Samantha opens chrome browser and opens the url {string}")
	public void samantha_opens_chrome_browser_and_opens_the_url(String string) {
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
	}

	@When("She enters {string} as username")
	public void she_enters_as_username(String item) {
	  WebElement username =driver.findElement(By.name("userName"));
	  username.sendKeys(item);
	}

	@When("She enters {string} as password")
	public void she_enters_as_password(String item) {
		WebElement username =driver.findElement(By.name("password"));
		  username.sendKeys(item);
	}

	@When("She clicks on Login button")
	public void she_clicks_on_login_button() {
		
		WebElement username =driver.findElement(By.xpath("//input[@type='submit']"));
		  username.click();
	}

	@Then("TestMeApp takes the samantha to homepage of the TestMeApp")
	public void test_me_app_takes_the_samantha_to_homepage_of_the_test_me_app() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Home");
	    
	}
	@After
	public void closeBrowser()
	{
			driver.quit();
	}
}
