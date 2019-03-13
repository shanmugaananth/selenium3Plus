package day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class DownloadFileInIE {
	WebDriver driver;
  @Test
  public void downloadFile() throws AWTException, InterruptedException {
	  driver.findElement(By.linkText("animatedcolors.xlsm")).click();
	  Thread.sleep(2000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_DOWN);
	  Thread.sleep(2000);
	  robot.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(2000);
	  robot.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(2000);
	  robot.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(2000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  Thread.sleep(6000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_C2D.02.12\\Desktop\\selenium3plus\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
