package org.web.automation.POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.web.automation.entryBehaviour.ApplicationProperties;

public class RegitrationPages {
	WebDriver driver;
	ActionWaitPages action;
 
 
 public RegitrationPages(WebDriver driver) {
	 this.driver = driver;
	  action = new ActionWaitPages(driver);
 }
	
	public void input_userName()  {
		action.enterDataIntoTextbox(driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_username_name"))),
				( ApplicationProperties.appPro("Application_Username")));;
		
		
	}
    public void input_emailAddress() {
    	driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_email_name"))).sendKeys
        (ApplicationProperties.appPro("Application_Email"));
		
	}
	
   public void input_password() {
	   driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_password_name"))).sendKeys
	     (ApplicationProperties.appPro("Application_Password"));
	
   }
   public void input_cpassword() {
	   driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_cpassword_name"))).sendKeys
	     (ApplicationProperties.appPro("Application_Cpassword"));
	}
   
   public void input_dob() {
	   driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_dobirth"))).sendKeys(ApplicationProperties.appPro("Application_Dob"));
	}
   
   public void input_phoneNumber() {
	     driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_phone"))).sendKeys(ApplicationProperties.appPro("Application_Phone"));

	}
   
   public void input_address() {
	     driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_adress"))).sendKeys(ApplicationProperties.appPro("Application_Address"));

	}
   public void input_addressType() {
	     driver.findElement(By.xpath(ApplicationProperties.elementlocator("Registration_page_addressType"))).click();

	}
   public void input_gender() {
	  action.selectionForDropdown(driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_sex"))), ApplicationProperties.appPro("Application_Gender"));
	   //Select gender = new Select(driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_sex"))));
	    // gender.selectByVisibleText(ApplicationProperties.appPro("Application_Gender"));
	}
   public void input_country() {
	   action.selectionForDropdown(driver.findElement(By.id(ApplicationProperties.elementlocator("Registration_page_country"))),ApplicationProperties.appPro("Application_Country"));
	   //Select country = new Select(driver.findElement(By.id(ApplicationProperties.elementlocator("Registration_page_country"))));
	   //  country.selectByVisibleText(ApplicationProperties.appPro("Application_Country"));
	     
	}
   
   public void input_state() {
	   action.selectionForDropdown(driver.findElement(By.id(ApplicationProperties.elementlocator("Registration_page_state"))), ApplicationProperties.appPro("Application_State"));
	   //Select input_state = new Select(driver.findElement(By.id(ApplicationProperties.elementlocator("Registration_page_state"))));
	   //  input_state.selectByVisibleText(ApplicationProperties.appPro("Application_State"));
	}
   public void input_city() {
	   action.selectionForDropdown(driver.findElement(By.id(ApplicationProperties.elementlocator("Registration_page_city"))),ApplicationProperties.appPro("Application_City"));
	   //Select city = new Select(driver.findElement(By.id(ApplicationProperties.elementlocator("Registration_page_city"))));
	     //city.selectByVisibleText(ApplicationProperties.appPro("Application_City"));
	}
   public void input_zipCode() {
	   driver.findElement(By.name(ApplicationProperties.elementlocator("Registration_page_zipcode"))).sendKeys(ApplicationProperties.appPro("Application_Zipcode"));
	}
   public void input_condition() {
	   driver.findElement(By.xpath(ApplicationProperties.elementlocator("Registration_page_checkbox"))).click();
	}
   public void input_signUp() {
	   action.clickableButtons(driver.findElement(By.xpath(ApplicationProperties.elementlocator("Registration_page_xpath_name")))
);
	 //  driver.findElement(By.xpath(ApplicationProperties.elementlocator("Registration_page_xpath_name"))).click();
	}
	

}
