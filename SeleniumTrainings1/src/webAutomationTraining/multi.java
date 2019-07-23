package webAutomationTraining;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

public class multi {

	public WebDriver driver;

  @Parameters("browser")

  @BeforeClass

  // Passing Browser parameter from TestNG xml

  public void beforeTest(String browser) {

  

  if(browser.equalsIgnoreCase("chrome")) {

	  driver = new FirefoxDriver();

    

  }else if (browser.equalsIgnoreCase("ie")) { 

	  

	  System.setProperty("webdriver.ie.driver", "D:\\Personal Doc\\softwares\\\\chromedriver_win32\\chromedriver.exe");

	  driver = new InternetExplorerDriver();

  } 

  

  driver.get("https://www.facebook.com/"); 

  }

  // Once Before method is completed, Test method will start

  @Test public void login() throws InterruptedException {

	driver.findElement(By.xpath(".//*[@id='account']/a")).click();

    driver.findElement(By.id("log")).sendKeys("testuser_1");

    driver.findElement(By.id("pwd")).sendKeys("Test@123");

    driver.findElement(By.id("login")).click();

	}  

  @AfterClass public void afterTest() {

		driver.quit();

	}
}

