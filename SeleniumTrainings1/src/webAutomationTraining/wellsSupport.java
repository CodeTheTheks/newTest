package webAutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wellsSupport {
	public static void main(String[] args) {
		//giving the driver location where the chrome driver is saved in the system
		String driverPath = "D:\\Personal Doc\\softwares\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");//u need to enter the given url
		driver.findElement(By.xpath("Xpath of the CompanyID")).sendKeys("wqabba06");//copy the xpath and replece it with -"Xpath of the CompanyID"
		driver.findElement(By.xpath("Xpath of the UserID")).sendKeys("bbuser1");//copy the xpath and replece it with -"Xpath of the UserID"
		driver.findElement(By.xpath("Xpath of the Password")).sendKeys("hitech@16");//copy the xpath and replece it with -"Xpath of the Password"
	

}
}