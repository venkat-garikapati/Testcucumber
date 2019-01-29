package Defenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pagelibrary.Login_page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefenition
{
	WebDriver driver;
	@Given("^open browser and start application$")
	public void open_browser_and_start_application() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","A:\\Soft Wares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_and_valid(String userna, String passwo) throws Throwable 
	{

		PageFactory.initElements(driver, Login_page.class);
		Login_page obj1=new Login_page();
		obj1.username_field(userna);
		obj1.password_field(passwo);
		
	}

	@Then("^user should able to login successfully$")
	public void user_should_able_to_login_successfully() throws Throwable 
	{
		PageFactory.initElements(driver, Login_page.class);
		Login_page obj2=new Login_page();
		obj2.submit_btn();
	   
	}
	@And("^close the site$")
	public void close_the_site() throws Throwable
	{
		driver.close();
		
	}



}
