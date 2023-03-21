package selenium_tutorial;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.web.automation.entryBehaviour.Base;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;


public class Tc_002_KeyboardActionKeys  extends Base{
	

	
	@Test
	public void facebook() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		driver.findElement(By.id("email")).sendKeys("pasmiracle@gmail.com");
		Actions act = new Actions(driver);
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("Adanne45").perform();
		//act.sendKeys(Keys.ENTER).perform();
		act.click(driver.findElement(By.xpath("//button[@type='submit']"))).perform();
		
		
		
		
		
		
//		driver.findElement(By.name("fld_username")).sendKeys("chidinma");
//         Actions actions = new Actions(driver);
//         actions.sendKeys(Keys.TAB).perform();// This is a special key for tab
//	     actions.sendKeys("miracle@gmail.com").perform();//
//         actions.sendKeys(Keys.ENTER).perform(); // This is a special key for enter
//	     actions.sendKeys("miracle@gmail.com").perform();
//	     actions.sendKeys("miracle").perform();
//	     actions.sendKeys(Keys.ENTER).perform();//Perform key is a convince way to carry out ations without calling the build
//         actions.keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).keyDown(Keys.CONTROL).build().perform();// This is use for back spacing and is keys combinations
//	     actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform(); //This use to highlight a word and is key combination
//	     actions.sendKeys(Keys.PAGE_DOWN).perform();//Sendkeys sends key to the interacting element and it return self reference
//	     //MOUSE OPERATION USING ACTION KEYS
//	     actions.click(driver.findElement(By.xpath("//input[@type='submit']"))).perform();//single click left
//	    actions.doubleClick(driver.findElement(By.xpath("//input[@type='submit']"))).perform();//double clicking
//	     actions.contextClick(driver.findElement(By.xpath("//input[@type='submit']"))).perform(); // right clicking
	}
 
}
