package com.google.page.test;

import org.testng.annotations.Test;
import org.web.automation.entryBehaviour.Base;

import com.aventstack.extentreports.ExtentTest;
import com.google.page.AboutPage;
import com.google.page.SignInPage;

public class SignInPageTest extends Base {
	
	
	
	
	
	
	
	
	@Test
	public void testLogin() {
		threadLocal.set(extent.createTest("Login into google"));
		navigateToURL("https://www.google.com/gmail/about/");
		AboutPage aboutPage  = new AboutPage(driver);
		SignInPage signInPage  = aboutPage.clickSignIn();
		signInPage.enterEmailOrPhone("");
		signInPage.clickNextEmail();
		signInPage.enterPassword("");
		signInPage.clickNextPassword();
		
		
	}

}
