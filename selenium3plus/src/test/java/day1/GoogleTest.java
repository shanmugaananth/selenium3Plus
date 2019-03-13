package day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GoogleTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).submit();
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("selenium - Google Search")) {
			System.out.println("Search Validation completed");
		}
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Desktop\\selenium3plus\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
