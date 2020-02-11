package gitpack1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class git1 {
	@Given("I want 40 in the calculator")
	public void  I_want_40_in_the_calculator() {
		System.out.println("I enter 50 in the calculator");

	}
	@And("I press additon")
	public void I_press_additon() {
		System.out.println("I press additon");
		
	}
	@And("I want another 70 ")
	public void I_want_another_70() {
		System.out.println("I want another 70 ");
	}
	
@When("When I press equal Symbol button")
public void  I_press_equal_Symbol_button() {
	System.out.println("I press equal Symbol button");
}
@Then(" the result should be 110 on the screen display")
public void the_result_should_be_110_on_the_screen_display() {
	System.out.println("the result should be 110 on the screen");
}
}
