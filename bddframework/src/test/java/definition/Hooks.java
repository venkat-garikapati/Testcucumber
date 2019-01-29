package definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks 
{
	public static WebDriver driver;
	
	@Before
	public static void browser()
	{
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
	}
	
	@After
	public static void screenshort(Scenario s)
	{
		if(s.isFailed())
		{
			
		}
		
	}

}
