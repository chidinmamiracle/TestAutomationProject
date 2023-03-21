package com.google.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.web.automation.entryBehaviour.Base;

import com.aventstack.extentreports.Status;

public class AboutPage  extends Base{
	
	
	@FindBy(xpath = "//*[@data-action='sign in']")
	private WebElement button_signIn;
	
	
	
	public AboutPage(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);	
	 
	}
	
	
	
	public SignInPage clickSignIn() {
		threadLocal.get().log(Status.INFO, "Click Sign In");
		waitForElementVisibilty(button_signIn, 0);
		button_signIn.click();
		return new SignInPage(driver);	
	}

}
