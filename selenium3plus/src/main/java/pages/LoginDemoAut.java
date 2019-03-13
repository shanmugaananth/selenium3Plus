package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginDemoAut {
	
	WebDriver driver;
	
	By username = By.name("userName");
	By password = By.name("password");
	By signIn = By.name("login");
	
	public LoginDemoAut(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUsername(String name) {
		driver.findElement(username).sendKeys(name);
	}
	
	public void enterPassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	
	public void clickSignIn() {
		driver.findElement(signIn).click();
	}

}
