package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tagss

{

	@Given("username and password field should be present on the landing page")
	public void username_and_password_field_should_be_present_on_the_landing_page() {
       System.out.println("I landing on Home page");
	}

	@When("I enter valid user credentials on the website")
	public void i_enter_valid_user_credentials_on_the_website() {
		 System.out.println("I enter valid user credentials");
	}

	@Then("I should be able to login status {int}")
	public void i_should_be_able_to_login_status(Integer int1) {
		 System.out.println("I should be able to login");
	}

	@When("I enter invalid userid on the website")
	public void i_enter_invalid_userid_on_the_website() {
		 System.out.println("I enter invalid userid");
	}

	@Then("I should not be able to login status {int}")
	public void i_should_not_be_able_to_login_status(Integer int1) {
		 System.out.println("I should not be able to login");
	}

	@When("I enter invalid password on the website")
	public void i_enter_invalid_password_on_the_website() {
		 System.out.println("I enter invalid password");
	}

}
