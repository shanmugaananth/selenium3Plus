package selenium3plus.selenium3plus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class launchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Desktop\\selenium3plus\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).submit();*/
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizable, 400, 200).perform();
		//driver.close();
	}

}
