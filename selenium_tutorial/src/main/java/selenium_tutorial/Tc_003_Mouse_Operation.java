package selenium_tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.web.automation.entryBehaviour.EntryBehaviour;

public class Tc_003_Mouse_Operation extends EntryBehaviour {

	
	@Test
	public void mouse() throws InterruptedException {
		//Thread.sleep(2000);
		//driver.findElement(By.name("fld_username")).sendKeys("chidinma");
         Actions actions = new Actions(driver);
         actions.moveToElement(driver.findElement(By.xpath("//a[contains(@title,'VIDEOS')]"))).perform();
         driver.findElement(By.xpath("//a[@title='Free Videos']")).click();

	     //MOUSE OPERATION USING ACTION KEYS
	    // actions.click(driver.findElement(By.xpath("//input[@type='submit']"))).perform();//single click left
	   // actions.doubleClick(driver.findElement(By.xpath("//input[@type='submit']"))).perform();//double clicking
	     //actions.contextClick(driver.findElement(By.xpath("//input[@type='submit']"))).perform(); // right clicking
         
	}
 
}



