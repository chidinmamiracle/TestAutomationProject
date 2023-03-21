package selenium_tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.web.automation.entryBehaviour.Base;

public class MouseAndKeyboardOperations extends Base{
	
	@Test
	public void mouse() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("Nuella Noble");
		driver.findElement(By.name("pass")).sendKeys("Adanne45");
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//button[@type='submit']"))).keyUp(Keys.CONTROL).build().perform();
		//findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
