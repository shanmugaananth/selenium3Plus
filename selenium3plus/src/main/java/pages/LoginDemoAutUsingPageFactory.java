package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
}
