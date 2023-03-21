package selenium_tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.web.automation.entryBehaviour.Base;

public class Tc005_Wait_Class extends Base{

	@Test
	//driver.manage().TimeOuts().implicitlywait(60,Timeunits.SECONDS); Its use to load elements
	public  void dropdown() {
	 Select country = new Select(driver.findElement(By.id("countryId")));
     country.selectByVisibleText("United States");// Here you have to maunally type in the country you want
     System.out.println(country.getFirstSelectedOption().getText());//Print only selected option in the tag
	 
     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
     wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.name("state")), "Tennessee"));
	Select state = new Select(driver.findElement(By.name("state")));
	state.selectByVisibleText("Tennessee");
	
	wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Antioch"));
	Select city = new Select(driver.findElement(By.id("cityId")));
	city.selectByVisibleText("Antioch");
	
	driver.findElement(By.name("zip")).sendKeys("37013");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//input[@value='Sign up']")).click();
	}

}
