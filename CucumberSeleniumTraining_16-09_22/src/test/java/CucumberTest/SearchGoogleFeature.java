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

public class SearchGoogleFeature {
	
	WebDriver driver;
	
//	@Before
//	public void openBrowser()
//	{
//	
//			driver=BrowserUtility.supplyDriver("chrome");
//			driver.manage().window().maximize();
//	}
	
	@Given("I am on the google search page")
	public void i_am_on_the_google_search_page() {
	    driver.get("ggole");
	}

	@When("I search for {string}")
	public void i_search_for(String item) {
	   WebElement search = driver.findElement(By.id("q"));
	   search.sendKeys(item);
	}

	@Then("The page title should start with {string}")
	public void the_page_title_should_start_with(String item) {
		String title=driver.getTitle();
	    Assert.assertTrue(title.contains(item));
	    
	}
	
//	@After
//	public void closeBrowser()
//	{
//		driver.quit();
//	}
}
