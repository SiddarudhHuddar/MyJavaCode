package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	 @Given("^User is on netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	        System.out.println("user is on landing page");
	    }

	    @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	    	  System.out.println("user user entered username and password");
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	  System.out.println("home page is papulated");
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	  System.out.println("cards are displayed successfully");
	    }

}
