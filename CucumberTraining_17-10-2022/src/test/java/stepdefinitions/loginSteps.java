package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	
	@Given("John is on the fb login page")
	public void john_is_on_the_fb_login_page() {
	    System.out.println("Login page starts..!!!");
	    
	}

	@When("he provides valid credentials")
	public void he_provides_valid_credentials() {
	    System.out.println("Entered Valid login credentials");
	    
	}

	@Then("he shall be able to view the fb wall")
	public void he_shall_be_able_to_view_the_fb_wall() {
	    System.out.println("Logged in succesfull");
	    
	}
}
