package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo

{

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	   System.out.println("I want to write a step with name1");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		  System.out.println("I check for the {int} in step");
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		  System.out.println("I verify the success in step");
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
		  System.out.println("I want to write a step with name2");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
		  System.out.println("I verify the Fail in step");
	}

}
