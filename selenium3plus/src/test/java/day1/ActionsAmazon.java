package day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class ActionsAmazon {
	WebDriver driver;
  @Test(enabled=false)
  public void f() throws InterruptedException {
	  Actions action = new Actions(driver);
	  WebElement shopByCategory = driver.findElement(By.xpath("//span[text()='Shop by']"));
	  WebElement amazonPrimeMusic1 = driver.findElement(By.xpath("//span[text()='Amazon Prime Music']"));
	  WebElement amazonPrimeMusic2 = driver.findElement(By.xpath("(//div[@class='nav-subcats'])[2]/div[5]//a/span[text()='Amazon Prime Music']"));
	  //action.clickAndHold(shopByCategory).release(shopByCategory).build().perform();
	  action.moveToElement(shopByCategory).perform();
	  Thread.sleep(5000);
	  action.moveToElement(amazonPrimeMusic1).perform();
	  Thread.sleep(5000);
	  action.click(amazonPrimeMusic2).build().perform();
	  //amazonPrimeMusic2.click();
	  Thread.sleep(5000);
	  System.out.println(driver.findElement(By.linkText("Login to join Prime")).getText());
  }
  
  @Test(priority=1)
  public void javaScriptExec() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  System.out.println(js.executeScript("return document.title;").toString());
	  
	  Thread.sleep(3000);
	  WebElement shopByCategory = driver.findElement(By.xpath("//span[text()='Shop by']"));
	  js.executeScript("arguments[0].click;", shopByCategory);
	  Thread.sleep(5000);
	  
	  js.executeScript("alert('Amazon Home page');");
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Desktop\\selenium3plus\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


}
