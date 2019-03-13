package day1;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ActionsTestMeApp {
	WebDriver driver;
	
  @Test(priority=1)
  public void f() {
	  driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	  driver.findElement(By.id("userName")).sendKeys("lalitha");
	  driver.findElement(By.id("password")).sendKeys("Password123");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Assert.assertEquals("Home", driver.getTitle());
  }
  @Test(priority=2)
  public void buyHeadPhone() {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebElement allCategories = driver.findElement(By.xpath("//span[text()='All Categories']"));
	  WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
	  WebElement headPhone = driver.findElement(By.xpath("//span[text()='Head Phone']"));
	  WebElement addToCart = driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
	  WebElement cart = driver.findElement(By.partialLinkText("Cart"));
	  Actions action  = new Actions(driver);
	  action.moveToElement(allCategories).perform();
	  action.moveToElement(electronics).perform();
	  action.moveToElement(headPhone).click().build().perform();
	  action.click(addToCart).perform();
	  cart.click();
	  String quantity = driver.findElement(By.xpath("//table//td[@data-th='Quantity']/input")).getAttribute("value");
	  Assert.assertEquals("1", quantity);
	  
  }
  @BeforeClass
  public void openApp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Desktop\\selenium3plus\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
  }

  @AfterClass
  public void closeApp() {
	  driver.close();
  }


}
