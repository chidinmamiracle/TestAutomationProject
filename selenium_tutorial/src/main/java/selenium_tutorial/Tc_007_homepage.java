package selenium_tutorial;

import org.openqa.selenium.By;
import org.web.automation.entryBehaviour.Base;

public class Tc_007_homepage extends Base{

	
	public void home() {
		
		driver.findElement(By.xpath("//button[@type ='button']")).click();
		driver.findElement(By.xpath("//a[@text()='Download']")).click();
		
	}
}
