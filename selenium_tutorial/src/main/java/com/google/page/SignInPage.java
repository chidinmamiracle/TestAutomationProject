package com.google.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.web.automation.entryBehaviour.Base;

import com.aventstack.extentreports.Status;


// Exact match css [jsname='LgbsSe']
// Partial Match 

public class SignInPage extends Base{

	
	
   @FindBy(xpath="//*[@id='identifierNext'] //button")
   private  WebElement button_next;
   
   private  By input_emailOrPhone =  By.id("identifierId");  
   private  By input_password = By.xpath("//input[@type='password']");
	
	
	public SignInPage(WebDriver driver) {
		  super.driver = driver;
		  PageFactory.initElements(driver, this);
	}
	
	
	
	public void enterEmailOrPhone(String emailOrPhone) {
		threadLocal.get().log(Status.INFO, "Enter email as " + emailOrPhone);
		WebElement emailElement = driver.findElement(input_emailOrPhone);
		waitForElementVisibilty(emailElement, 10);
		emailElement.sendKeys(emailOrPhone);		
	}
	
	public void clickNextEmail() {
		threadLocal.get().log(Status.INFO, "Click Next");
		button_next.click();
	}
	
	public void clickNextPassword() {
		threadLocal.get().log(Status.INFO, "Click Next");
		 
	}
	
	public void enterPassword(String password) {
		threadLocal.get().log(Status.INFO, "Enter password as " + password);
		WebElement passElement = driver.findElement(input_password);
		waitForElementVisibilty(passElement, 10);
		passElement.sendKeys(password);
	}
	
}
