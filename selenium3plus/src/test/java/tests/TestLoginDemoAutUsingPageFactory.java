package tests;

import org.testng.annotations.Test;

import pages.LoginDemoAutUsingPageFactory;
import utilities.BrowserFactory;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class TestLoginDemoAutUsingPageFactory {
	WebDriver driver;
  @Test
  public void loginDemoAutUsingpf() {
	  LoginDemoAutUsingPageFactory login = PageFactory.initElements(driver, LoginDemoAutUsingPageFactory.class);
	  login.loginToDemoAut("tutorial", "tutorial");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=BrowserFactory.startBrowser("firefox", "http://demoaut.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
