package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definition 
{
	WebDriver driver;
	@Given("^Open browser and launch facebook$")
	public void Open_browser_and_launch_facebook() throws Throwable 
	{
		System.setProperty("webdriver.gecko.driver","D:\\Desktop and Download Data\\Desktop\\Selenium\\Gecko Driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	
	}

	@When("^Enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void Enter_valid_username_and_valid_password(String uname,String pwd) throws Throwable 
	{
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("pass")).sendKeys(pwd);
	}

	@Then("^User should login in facebook account$")
	public void User_should_login_in_facebook_account() throws Throwable 
	{
	driver.findElement(By.xpath("//input[contains(@id,'u_0_')]")).click();
	}

}
