package Pagelibrary;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page 
{
	
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(id="u_0_2")
	WebElement submit;
	
	public void username_field(String user)
	{
		username.sendKeys(user);
	}
	public void password_field(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void submit_btn()
	{
		submit.click();
	}
	

}
