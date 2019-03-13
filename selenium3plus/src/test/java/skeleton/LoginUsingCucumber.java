package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utilities.BrowserFactory;

public class LoginUsingCucumber {
	WebDriver driver;
	
	@Given("^user loads url$")
	public void user_loads_url() throws Throwable {
		driver = BrowserFactory.startBrowser("firefox", "http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	}

	@When("^user enters credentials and submits$")
	public void user_enters_credentials_and_submits() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		  driver.findElement(By.id("userName")).sendKeys("lalitha");
		  driver.findElement(By.id("password")).sendKeys("Password123");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^verify home page title$")
	public void verify_home_page_title() throws Throwable {
		Assert.assertEquals("Home", driver.getTitle());
	}
}
