package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class ReadExcel  {
	static WebDriver driver;
	private static XSSFWorkbook wbook;

	public static void readExcel() throws IOException {
		driver=BrowserFactory.startBrowser("firefox", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		File file = new File("C:\\Users\\training_C2D.02.12\\Desktop\\selenium3plus\\data\\data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		/*for(int i=0; i<=2; i++) {
			for(int j=0;j<=2;j++) {
			System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			//	System.out.println(sheet.getRow(i).getCell(1).getStringCellValue());
		}
		}*/
		String uname = sheet.getRow(0).getCell(0).getStringCellValue();
		String pswd = sheet.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.id("userName")).sendKeys(uname);
		  driver.findElement(By.id("password")).sendKeys(pswd);
		wbook.close();

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		  Assert.assertEquals("Home", driver.getTitle());
	}
	
	public static void main(String[] args) throws IOException {
		ReadExcel.readExcel();
	}
}
