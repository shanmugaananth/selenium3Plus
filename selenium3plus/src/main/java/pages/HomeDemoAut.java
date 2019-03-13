package pages;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomeDemoAut {
	WebDriver driver;
	@Then("^verify home page title$")
	public void verify_home_page_title() throws Throwable {
		Assert.assertEquals("Home", driver.getTitle());
	}
}
