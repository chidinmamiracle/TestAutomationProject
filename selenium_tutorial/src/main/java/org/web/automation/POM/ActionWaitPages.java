package org.web.automation.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.web.automation.entryBehaviour.Base;
import org.web.automation.entryBehaviour.SreenshotOfPrject;

public class ActionWaitPages extends Base{
	
//	WebDriver driver = null;
	WebDriverWait wait;
	public ActionWaitPages(WebDriver driver) {
		this.driver = driver;
	    wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
		
	
	
	public void enterDataIntoTextbox(WebElement element, String text) {
		try {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
		}
		catch (Exception e) {
			System.out.println("********************Exception******************");
		    SreenshotOfPrject.takeScreenShot(driver,"Fail to enter textbox");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void enterInvisibleElment( WebElement element,String text) { 
		try {
		wait.until(ExpectedConditions.invisibilityOf(element));
		element.sendKeys(text);
		}
		  catch (Exception e) {
				System.out.println("********************Exception*************");
			    SreenshotOfPrject.takeScreenShot(driver,"No invisible element found");
				e.printStackTrace();
				Assert.fail();
		  }
	}
	
	public void clickableButtons(WebElement element) {
		try {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}
		  catch (Exception e) {
				System.out.println("********************Exception*************");
			    SreenshotOfPrject.takeScreenShot(driver,"error_Clickable button not visible");
				e.printStackTrace();
				Assert.fail();
		  }
	}
	
	public void selectionForDropdown(WebElement element,String text) {
		try {
		wait.until(ExpectedConditions.textToBePresentInElement(element,text));
		Select select = new Select(element);
		select.selectByVisibleText(text);
		}
		  catch (Exception e) {
				System.out.println("********************Exception*************");
			    SreenshotOfPrject.takeScreenShot(driver,"dropdown null");
				e.printStackTrace();
				Assert.fail();
		  }
	}

}
