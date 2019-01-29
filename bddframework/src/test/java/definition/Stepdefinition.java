package definition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefinition 
{
	WebDriver driver;
	@Given("^launch the site$")
	public void launch_the_site() throws Throwable 
	{
	    driver.get("");
	}

	@When("^Enter the userid with \"([^\"]*)\" and password with \"([^\"]*)\" data and click on login btn$")
	public void Enter_the_userid_with_and_password_with_data_and_click_on_login_btn(String arg1, String arg2) throws Throwable 
	{
	    
	}

	@Then("^Branches btn  should be displayed and click on branch btn$")
	public void Branches_btn_should_be_displayed_and_click_on_branch_btn() throws Throwable 
	{
	    
	}

	@Then("^close site$")
	public void close_site() throws Throwable 
	{
	    
	}

	@Then("^newbranch btn should be displayed and click newbranch btn$")
	public void newbranch_btn_should_be_displayed_and_click_newbranch_btn() throws Throwable 
	{
	    
	}

	@When("^Enter the data for newbranch btn with \"([^\"]*)\" data set$")
	public void Enter_the_data_for_newbranch_btn_with_data_set(String arg1) throws Throwable 
	{
	    
	}
	

}
