package webAutomationTraining;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		String driverPath = "D:\\Personal Doc\\softwares\\chromedriver_win32\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);

	 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test(priority = 0)
	public void main() {
		driver.findElement(By.className("inputtext")).sendKeys("Junk Values");
		driver.findElement(By.linkText("Forgotten account?")).click();

	}
	@Test(priority= 1)
	

	 @AfterMethod
	 public void afterMethod() 
	 {
		 driver.quit();
		 }
	
}
