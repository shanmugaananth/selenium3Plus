package tests;

import org.testng.annotations.Test;

import pages.LoginDemoAut;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class TestLoginDemoAut {
	WebDriver driver;
  @Test
  public void login() {
	  LoginDemoAut login = new LoginDemoAut(driver);
	  login.enterUsername("tutorial");
	  login.enterPassword("tutorial");
	  login.clickSignIn();
	  WebDriverWait wait = new WebDriverWait(driver, 50000);
	  wait.until(ExpectedConditions.elementToBeClickable((By) driver.findElement(By.name("findFlights"))));
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_C2D.02.12\\Desktop\\selenium3plus\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demoaut.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
