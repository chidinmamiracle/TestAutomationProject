package org.web.automation.entryBehaviour;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.web.automation.POM.LoginPages;
import org.web.automation.POM.RegitrationPages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import test.utility.ScreenShot;

public class Base {
	
 public WebDriver driver;
 public LoginPages login;
 public RegitrationPages register;
 public static ExtentHtmlReporter htmlReporter;
 public ScreenShot  sShot;
 public static ExtentReports extent;

 protected static ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<ExtentTest>();

 
 
 @BeforeSuite(alwaysRun = true)
 public void setup() {
	 
	 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/testrun/Test_Result.html");
	 extent = new ExtentReports();
	 extent.attachReporter(htmlReporter);                                                                 

     htmlReporter.config().setDocumentTitle("Test Report");

     htmlReporter.config().setReportName("Chidinma Report");             

     htmlReporter.config().setTheme(Theme.DARK);
	 
 }
  
 
  
	@BeforeMethod(alwaysRun = true)
	public void startBrowser() {
		//This is how to set the browser from the propertyFile.
		//Here you can  choose or select the browser you want.
		//And the parent class of all the drive is WEBDRIVER.
		//Hence you have to creat object of the child class and call the reference of the parent class.
		//And this is an OOPS concept called POLYMOPHISM.
		if (ApplicationProperties.appPro("Browser_Name").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		else if (ApplicationProperties.appPro("Browser_Name").equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}

		else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		}
	    //This method is use to maximize browser window
//	    driver.get("https://www.google.com");
//	    driver.get(ApplicationProperties.appPro("Application_URL"));
//	    login = new LoginPages(driver);
//	    register = new RegitrationPages(driver);

	}
	
	@SuppressWarnings("serial")
	@AfterMethod(alwaysRun = true)
	public void closeBrowser(final ITestResult testResult, Method method) throws IOException {
		
		if (testResult.getStatus() == ITestResult.SUCCESS) {
			threadLocal.get().log(Status.PASS, MarkupHelper.createLabel("PASSED", ExtentColor.GREEN));
		}
		else if (testResult.getStatus() == ITestResult.FAILURE) {
			threadLocal.get().log(Status.FAIL, MarkupHelper.createLabel("FAILED !!", ExtentColor.RED));
			Markup m = new Markup() {  
				public String getMarkup() {
					return "<textarea disabled=\"\" style=\"margin: 0px; height: 394px; width: 2044px;\">"
							+ ExceptionUtils.getStackTrace(testResult.getThrowable()) + "</textarea>";
				}

			};

			ScreenShot sShot = new ScreenShot();
			threadLocal.get().addScreenCaptureFromPath(sShot.takeScreenshot(driver), "Screenshot of page");
			threadLocal.get().debug(m);
			threadLocal.get().log(Status.INFO,
			MarkupHelper.createLabel("Use the XML below to execute the test".toUpperCase(), ExtentColor.RED));
		}

		else if (testResult.getStatus() == ITestResult.SKIP) {
			threadLocal.get().log(Status.SKIP, MarkupHelper.createLabel("RETRY !!", ExtentColor.YELLOW));
			Markup m = new Markup() {
				public String getMarkup() {
					return "<textarea disabled=\"\" style=\"margin: 0px; height: 394px; width: 2044px;\">"
							+ ExceptionUtils.getStackTrace(testResult.getThrowable()) + "</textarea>";

				}

			};

			sShot = new ScreenShot();
			threadLocal.get().addScreenCaptureFromPath(sShot.takeScreenshot(driver), "Screenshot of page");
			threadLocal.get().debug(m);

		}

		try {

			driver.quit();

		} catch (Exception e) {

			driver.quit();

		}

		// driver.close();
	 System.out.println("TESSSS");
	 
	 extent.flush();
	}
	
	
	public void navigateToURL(String url) {
		driver.navigate().to(url);
		  driver.manage().window().maximize();
	}
	 
	
	
	public void waitForElementVisibilty(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	

}
