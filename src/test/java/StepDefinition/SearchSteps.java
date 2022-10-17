package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps

{

	@Given("Search field should br present  on the Way2Automation website")
	public void search_field_should_br_present_on_the_way2automation_website() {
		System.out.println("Step 1: I landed on search Page");
	}

	@When("I search for course {string} having price {int}")
	public void i_search_for_course_having_price(String courceName, Integer price) {
		System.out.println("Step 2: search the cource with name: " + courceName +  "price: " + price);
	}

	@Then("Course {string} should be displayed")
	public void course_should_be_displayed(String courceName) {
		System.out.println("Step 3: cource" + courceName + "is displayed");
	}

	@Given("Search field should br present on the selenium website")
	public void search_field_should_br_present_on_the_selenium_website() {
		System.out.println("Search field should br present on the selenium website");
	}

}
