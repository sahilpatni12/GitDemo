package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {

	 

	@Given("^User is on Net Banking page$")
    public void user_is_on_net_banking_page() throws Throwable {
		System.out.println("User is on login Page gitstuff");
    }

	@When("^User logins with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logins_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        
		System.out.println(strArg1);
		System.out.println(strArg2);
    }

	
	 @When("^User signs up with following details$")
	    public void user_signs_up_with_following_details(DataTable data) throws Throwable {
	       java.util.List<java.util.List<String>> obj= data.asLists();
	       System.out.println(((java.util.List<java.util.List<String>>) obj).get(0).get(0));
	       System.out.println(((java.util.List<java.util.List<String>>) obj).get(0).get(1));
	       System.out.println(((java.util.List<java.util.List<String>>) obj).get(0).get(2));
	    }
	 
	 @When("^User signs up with (.+) and (.+)$")
	    public void user_signs_up_with_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }
	 
    @Then("^Net Banking Main page is displayed$")
    public void net_banking_main_page_is_displayed() throws Throwable {
    	System.out.println("Then");
    }
	
    @And("^Cards diplayed are \"([^\"]*)\"$")
    public void cards_diplayed_are_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    }
	
	
}
