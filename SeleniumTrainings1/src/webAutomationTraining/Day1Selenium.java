package webAutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1Selenium {

	public static void main(String[] args) {
		//giving the driver location where the chrome driver is saved in the system
		String driverPath = "D:\\Personal Doc\\softwares\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*
		 * String title =driver.getTitle(); System.out.println(title); String URL =
		 * driver.getCurrentUrl(); System.out.println(URL);
		 */
		
		/*
		 * driver.findElement(By.className("inputtext")).sendKeys("Junk Values");
		 * driver.findElement(By.linkText("Forgotten account?")).click();
		 * driver.findElement(By.className("inputtext")).isDisplayed();
		 * driver.findElement(By.className("inputtext")).isEnabled();
		 * driver.findElement(By.className("inputtext")).isSelected();
		 * driver.findElement(By.className("inputtext")).getClass();
		 */
		
		/*
		 * WebElement radioBtn = driver.findElement(By.id("u_0_6")); radioBtn.click();
		 */
		
		//driver.get("http://demo.guru99.com/test/newtours/");
		
		//driver.findElement(By.className("inputtext")).sendKeys("Junk Values");
		/*
		 * driver.findElement(By.name("pass")).sendKeys("12345");
		 * //driver.findElement(By.id("u_0_8")).click();
		 * driver.findElement(By.linkText("Forgotten account?")).click();
		 */
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hi");
		
		/*
		 * driver.get("https://login.salesforce.com/?locale=in");
		 * driver.findElement(By.className("button r4 wide primary")).click();
		 * 
		 */
		//driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mngr194630");
		//driver.findElement(By.cssSelector("#email")).sendKeys("my CSS");
		/*
		 * //driver.quit();
		 * 
		 * driver.navigate().to("https://login.salesforce.com/?locale=in");
		 * driver.navigate().back(); driver.navigate().forward();
		 * driver.navigate().refresh();
		 */
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select day = new Select(element);
		day.selectByIndex(32);
		
		
		
		
		
		
		

	}

}
