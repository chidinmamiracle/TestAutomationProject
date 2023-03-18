package org.web.automation.entryBehaviour;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SreenshotOfPrject{
	
	public static void takeScreenShot(WebDriver driver, String name) {
		try {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
	    TakesScreenshot screen = (TakesScreenshot) driver;
	    File f =  screen.getScreenshotAs(OutputType.FILE);
		//File f2 = new File("./ProjectSreeenshot/"+name+cal.getTime().toString().replace("", "").replace(": ", " ")+".png");
		File f2 = new File("./ProjectSreeenshot/pix.png");
		FileUtils.copyFile(f, f2);
		}
		catch (Exception e) {
			System.out.println("***********************expectated*************************");
			e.printStackTrace();
			Assert.fail();
			
		}
		
		

	}
	//<listeners>
   // <listener    class-name="org.uncommon.reportng.HTMLReporter"></listener>
   // <listener    class-name="org.uncommon.reportng.JUnitXMLReporter"></listener>
//</listeners>

}
