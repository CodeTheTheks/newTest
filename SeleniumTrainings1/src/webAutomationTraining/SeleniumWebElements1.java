package webAutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElements1 {

	public static void main(String[] args) {
String driverPath = "D:\\Personal Doc\\softwares\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		WebElement oCheckBox = driver.findElement(By.xpath("//*[contains(@name,'rememberUn')]"));
		oCheckBox.click();

	}

}
