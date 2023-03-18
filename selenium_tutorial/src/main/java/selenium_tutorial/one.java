package selenium_tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +  "\\Driver\\chromedriver.exe");
		//webDreiver is an interface that controls the user web browser
		//Chrome driver creates a new chrome driver using the server config
		WebDriver driver = new ChromeDriver();
		//Get loads a new we page in the current browser window
		driver.get("https://www.google.co.in/");
		String definitionOfTerm= "What is a noun";
		//The webElement represent a html element,and all that interaction with the web page interface.
		//FindElement finds the first webElement using the given method 
		//By is mechanism use to locate element in a document
		//Name has to locate elements by the value of the name
		WebElement findingDefinitionOfTermElement=driver.findElement(By.name("q"));
		//SendKeys is a method to stimulate typing into an element,and helps to set the value of an element 
		
		findingDefinitionOfTermElement.sendKeys(definitionOfTerm);
		//findingDefinitionOfTermElement.clear();
		
	
	findingDefinitionOfTermElement.sendKeys(Keys.ENTER);
	//Keys represent a presable key that aren't text and the are stored in the unicode
	Thread.sleep(3000);
	//LIST gives control over where the list of item is inserted,is an order of collection
	List<WebElement> buttonClick =driver.findElements(By.name("btnK"));
	WebElement web = buttonClick.get(1);
	web.click();
	Thread.sleep(3000);
	
	//findingDefinitionOfTermElement.clear();
		driver.close();
		driver.quit();

		
		
		
		
		
		//String titleString = driver.getTitle();
		
		
		
		
		Thread.sleep(3000);
		System.out.println("The title is" + definitionOfTerm);
		
		//driver.close();
		//driver.quit();

	}

}
