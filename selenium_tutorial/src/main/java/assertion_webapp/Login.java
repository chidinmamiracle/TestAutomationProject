package assertion_webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Login {
	WebDriver driver;
	
	@BeforeMethod
	public void startBRowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void facebookLogin() {
		driver.findElement(By.name("email")).sendKeys("pasmiracle");
		driver.findElement(By.id("pass")).sendKeys("miracle");
		Assert.assertEquals("actualResult", "expectedResult");
		
	}
	@AfterMethod
	public void closerbrowser() {
		//driver.close();
	}

}
