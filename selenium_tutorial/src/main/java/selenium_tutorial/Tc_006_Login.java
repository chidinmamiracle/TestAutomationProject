package selenium_tutorial;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.web.automation.POM.RegitrationPages;
import org.web.automation.entryBehaviour.ApplicationProperties;
import org.web.automation.entryBehaviour.Base;

public class Tc_006_Login extends Base {
	
	@Test
	public void loginFunctions() throws InterruptedException, IOException {
		register.input_userName();
		register.input_emailAddress();
		register.input_address();
		register.input_addressType();
		register.input_cpassword();
		register.input_dob();
		register.input_gender();
		register.input_password();
		register.input_phoneNumber();
		register.input_country();
		register.input_state();
		register.input_city();
		register.input_zipCode();
		register.input_signUp();
		register.input_condition();

//		WebElement tab_login = driver.findElement( By.cssSelector("[for='tab2']"));
//		WebElement input_userName = driver.findElement( By.name("_txtUserName"));
//		WebElement input_password = driver.findElement(By.name("_txtPassword"));
//		WebElement input_phone = driver.findElement(By.name("phone"));
//
//		
//		waitForElementVisibilty(input_phone,10); // wait for phone number input to load
//		tab_login.click();
//		waitForElementVisibilty(input_userName,10); // wait for username input to load
//		input_userName.sendKeys("ggggggg");
//		input_password.sendKeys("sssssss");
//		//		Thread.sleep(5000);hhjiko
		
		//OR
		 
//		 driver.findElement( By.cssSelector(ApplicationProperties.elementlocator("Login_page_tabLogin"))).click();;
//		 driver.findElement( By.name(ApplicationProperties.elementlocator("Login_page_Username"))).sendKeys(ApplicationProperties.appPro("Application_Login_Username"));;
//		 driver.findElement(By.name(ApplicationProperties.elementlocator("Login_page_password"))).sendKeys(ApplicationProperties.appPro("Application_Login_Password"));;
//		 
//		 driver.findElement(By.xpath(ApplicationProperties.elementlocator("Login_page_sign_in"))).click();
		 
		 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		// wait.until(ExpectedConditions.invisibilityOf( driver.findElement(By.xpath("//a[@text()='Download']")).click()));
		

//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@text()='View Me']"))));
	
		// driver.findElement(By.xpath("//button[@text()='View Me']")).click();
		//	driver.findElement(By.xpath("//a[@text()='Download']")).click();

	
	
		
	
		
		
		
		
		
	}
	


}
