package org.web.automation.POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.web.automation.entryBehaviour.ApplicationProperties;
import org.web.automation.entryBehaviour.Base;
import org.web.automation.entryBehaviour.SreenshotOfPrject;

import com.aventstack.extentreports.Status;

public class LoginPages extends Base{
 
	ActionWaitPages action;
	
	public LoginPages(WebDriver driver) {
		this.driver = driver;
	    action = new ActionWaitPages(driver);
	}
	
   public void tab_Login() {
	   threadLocal.get().log(Status.INFO, "Tab login ");
	   try {
	  action.clickableButtons(driver.findElement( By.cssSelector(ApplicationProperties.elementlocator("Login_page_tabLogin"))));
	   }
	   catch (Exception e) {
		System.out.println("********************Exception*************");
	    SreenshotOfPrject.takeScreenShot(driver,"error_pix.png");
		e.printStackTrace();
		Assert.fail();
	
	}
	}
   
   public void input_userName() {
	   try {
	   action.enterDataIntoTextbox( driver.findElement( By.name(ApplicationProperties.elementlocator("Login_page_Username"))),
			   (ApplicationProperties.appPro("Application_Login_Username")));;
	   }
	   catch (Exception e) {
			System.out.println("********************Exception*************");
		    SreenshotOfPrject.takeScreenShot(driver,"error_pix.png username");
			e.printStackTrace();
			Assert.fail();
	   }
	}
   public void input_password(String password)  {
	   try {
	   action.enterDataIntoTextbox(driver.findElement(By.name(ApplicationProperties.elementlocator("Login_page_password"))), password);
	   }
	   catch (Exception e) {
			System.out.println("********************Exception*************");
		    SreenshotOfPrject.takeScreenShot(driver,"Password not found");
			e.printStackTrace();
			Assert.fail();
	   }
	}
   public void sign_in() {
	   try {
	   action.clickableButtons(driver.findElement(By.xpath(ApplicationProperties.elementlocator("Login_page_sign_in"))));
	   }
	   catch (Exception e) {
		   System.out.println("****************Exception**************");
		    SreenshotOfPrject.takeScreenShot(driver,"Not found");

		   e.printStackTrace();
		   Assert.fail();
	}
	}

}
