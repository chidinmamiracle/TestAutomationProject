package test.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	File source;
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	String screenShotDestination = System.getProperty("user.dir").replace("\\", "/")
			+ "/src/main/java/com/quikq/testruns/report/" + dateName + "ErrorShot.png";

	public String takeScreenshot(WebDriver driver) throws IOException {
		source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(screenShotDestination));
		return screenShotDestination;
	}

	public String getImage(WebDriver driver, String directory) throws IOException {
		source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(directory));
		return screenShotDestination;
	}
}
