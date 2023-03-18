package selenium_tutorial;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc_001_Registration_Firefolks {
FirefoxDriver driver;
	
	@BeforeMethod
	public void startBrowser() {
		 System.setProperty("Webdriver.gecko.driver","C:\\Users\\pasmi\\Downloads\\geckodriver-v0.32.0-win64.zip\\geckodriver.exe");
	     //System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe" );
		  driver = new FirefoxDriver();
	       //driver.get("https://thetestingworld.com/testings/");
		  driver.navigate().to("https://thetestingworld.com/testings/");
	}
	
	@AfterMethod
	public void closeBrowser() {
	driver.close();
	driver.quit();
		
	}
	
	@Test
	public void tc001() {
     driver.findElement(By.name("fld_username")).sendKeys("Chidinma");
     driver.findElement(By.name("fld_email")).sendKeys("pasmiracle93@gmail.com");
     driver.findElement(By.name("fld_password")).sendKeys("Miracle051990");
     driver.findElement(By.name("fld_cpassword")).sendKeys("Miracle051990");
     driver.findElement(By.name("dob")).sendKeys("5/18/1990");
     driver.findElement(By.name("phone")).sendKeys("6153356558");
     driver.findElement(By.name("address")).sendKeys("760 dover glen drive");
     driver.findElement(By.name("sex")).sendKeys("Female");
     driver.findElement(By.name("country")).sendKeys("USA");
     driver.findElement(By.name("state")).sendKeys("Tennesse");
     driver.findElement(By.name("city")).sendKeys("Nashvile");
     driver.findElement(By.name("zip")).sendKeys("37013");
     driver.findElement(By.xpath("//input[@value='Sign up']")).click();
     
	}


}
