package selenium_tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver dir = new ChromeDriver();
		dir.get("https://www.google.com");
		String findJava = "java";
		WebElement searching =dir.findElement(By.name("q"));
		searching.sendKeys(findJava);
		//searching.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		searching.clear();
		Thread.sleep(3000);
		System.out.println(findJava);
	
		dir.close();
		dir.quit();
		
		
		
		
		
		
		
//		String st  = dir.getTitle();
//		Thread.sleep(5000);
//		System.out.println("This is 3 school" + dir);
//		dir.close();
//		dir.quit();

	}

}
