package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentBankSystem {

	@Given("Rakesh enters card details")
	public void rakesh_enters_card_details() {
	    System.out.println("1");
	   
	}

	@Given("Request OTP")
	public void request_otp() {
	    System.out.println("2");
	   
	}

	@When("OTP receives")
	public void otp_receives() {
	    System.out.println("3");
	   
	}

	@When("Enters Proper OTP")
	public void enters_proper_otp() {
	    System.out.println("4");
	   
	}

	@Then("Payment successfull")
	public void payment_successfull() {
	    System.out.println("5");
	   
	}

	@Given("Enters wrong OTP")
	public void enters_wrong_otp() {
	    System.out.println("6");
	   
	}

	@Then("Payment failure")
	public void payment_failure() {
	    System.out.println("7");
	   
	}

	@Given("Waits for {int} mins")
	public void waits_for_mins(Integer int1) {
	    System.out.println("8");
	   
	}

	@When("Payment page expires")
	public void payment_page_expires() {
	    System.out.println("9");
	   
	}

	@Given("Rakesh selects item in cart for payment")
	public void rakesh_selects_item_in_cart_for_payment() {
	    System.out.println("10");
	   
	}

	@Given("Selects Bank for payment")
	public void selects_bank_for_payment() {
	    System.out.println("11");
	   
	}

	@When("Payment page broken")
	public void payment_page_broken() {
	    System.out.println("12");
	   
	}
}
