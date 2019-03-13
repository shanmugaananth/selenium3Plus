package tests;

import org.testng.annotations.Test;

import utilities.BrowserFactory;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class TestLoginTestMeAppUsingInputExcel {
	WebDriver driver;
  @Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=BrowserFactory.startBrowser("firefox", "http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
