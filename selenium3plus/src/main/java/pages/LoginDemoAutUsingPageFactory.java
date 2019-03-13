package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import cucumber.api.java.en.When;

public class LoginDemoAutUsingPageFactory {
	WebDriver driver;
	public LoginDemoAutUsingPageFactory(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.NAME,using="userName")
	WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	
	@FindBy(how=How.NAME,using="login")
	WebElement signIn;
	
	public void loginToDemoAut(String uName, String pswd) {
		username.sendKeys(uName);
		password.sendKeys(pswd);
		signIn.click();
	}
	
	@When("^user enters credentials and submits$")
	public void user_enters_credentials_and_submits() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		  driver.findElement(By.id("userName")).sendKeys("lalitha");
		  driver.findElement(By.id("password")).sendKeys("Password123");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
