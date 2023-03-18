package selenium_tutorial;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.web.automation.POM.LoginPages;
import org.web.automation.POM.RegitrationPages;
import org.web.automation.entryBehaviour.ApplicationProperties;
import org.web.automation.entryBehaviour.EntryBehaviour;
import org.web.automation.entryBehaviour.SreenshotOfPrject;

import com.aventstack.extentreports.Status;


public class Tc_001_Registration_Functions extends EntryBehaviour {
	
	
	LoginPages login;
	
	@Test
	public void tc001() throws IOException, InterruptedException {
		threadLocal.set(extent.createTest("Test Facebook"));            

		 
		navigateToURL(ApplicationProperties.appPro("Application_URL"));
		login = new LoginPages(this.driver);
		 
		
		login.tab_Login();
		login.input_userName();
		login.input_password("fxtrytkd");
		login.sign_in();
		
   register = new RegitrationPages(driver);
		
//     driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_username_name"))).sendKeys
//     ( ApplicationProperties.appPro("Application_Username"));
//     driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_email_name"))).sendKeys
//     (ApplicationProperties.appPro("Application_Email"));
//     driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_password_name"))).sendKeys
//     (ApplicationProperties.appPro("Application_Password"));
//     driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_cpassword_name"))).sendKeys
//     (ApplicationProperties.appPro("Application_Cpassword"));
//     //Assert.assertTrue(verify.validateElementVisibility(driver, "id", ApplicationProperties.elementlocator("Registration_page_email_name")), "[Error -- Element not visible]");
//     driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_dobirth"))).sendKeys(ApplicationProperties.appPro("Application_Dob"));
//     driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_phone"))).sendKeys(ApplicationProperties.appPro("Application_Phone"));
//     driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_adress"))).sendKeys(ApplicationProperties.appPro("Application_Address"));
//     driver.findElement(By.xpath(ApplicationProperties.elementlocator("Registration_page_addressType"))).click();
//    // driver.findElement(By.xpath(ApplicationProperties.elementlocator("Registration_page_xpath_name"))).click();
//     Select gender = new Select(driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_sex"))));
//     gender.selectByVisibleText(ApplicationProperties.appPro("Application_Gender"));
//
//     Select country = new Select(driver.findElement(By.id(ApplicationProperties.elementlocator("Registration_page_country"))));
//     country.selectByVisibleText(ApplicationProperties.appPro("Application_Country"));
//     

//     Select input_state = new Select(driver.findElement(By.id(ApplicationProperties.elementlocator("Registration_page_state"))));
//     input_state.selectByVisibleText(ApplicationProperties.appPro("Application_State"));

//
//     Select city = new Select(driver.findElement(By.id(ApplicationProperties.elementlocator("Registration_page_city"))));
//     city.selectByVisibleText(ApplicationProperties.appPro("Application_City"));
//     
//    // driver.findElement(By.xpath(ApplicationProperties.elementlocator("Registration_page_checkbox"))).click();
//     driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_zipcode"))).sendKeys(ApplicationProperties.appPro("Application_Zipcode"));
//     driver.findElement(By.xpath(ApplicationProperties.elementlocator("Registration_page_checkbox"))).click();
//     driver.findElement(By.xpath(ApplicationProperties.elementlocator("Registration_page_xpath_name"))).click();
//    SreenshotOfPrject.takeScreenShot(driver,"error_pix.png");
     
     
//     System.out.println("The current url of the age is  ---->" + driver.getCurrentUrl());
//     System.out.println("The HTML  of the page is ----->" + driver.getPageSource());
//     System.out.println("The title of the page is ----->"  + driver.getTitle());
//     System.out.println("The innertext is ---->" + driver.findElement(By.xpath("//a[text()='Read Detail']")).getText());
//     System.out.println("The html attribute is --->" + driver.findElement(By.name("add_type")).getAttribute("type")); 
//     System.out.println("The cordinate is ----->" + driver.findElement(By.name("fld_username")).getLocation());
//     System.out.println("To know if curent element is visible or not --->"+ driver.findElement(By.name("phone")).isDisplayed());
//     System.out.println(driver.findElement(By.name("fld_cpassword")).isEnabled());// This is use to know if the element is enabled and it returns a boolean value
//     System.out.println(driver.findElement(By.name("terms")).isSelected());
//     driver.findElement(By.name("terms")).click();
//     System.out.println(driver.findElement(By.name("terms")).isSelected());
     
	}
}	
