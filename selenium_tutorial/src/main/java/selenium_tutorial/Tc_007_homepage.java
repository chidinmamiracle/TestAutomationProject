package selenium_tutorial;

import org.openqa.selenium.By;
import org.web.automation.entryBehaviour.EntryBehaviour;

public class Tc_007_homepage extends EntryBehaviour{

	
	public void home() {
		
		driver.findElement(By.xpath("//button[@type ='button']")).click();
		driver.findElement(By.xpath("//a[@text()='Download']")).click();
		
	}
}
