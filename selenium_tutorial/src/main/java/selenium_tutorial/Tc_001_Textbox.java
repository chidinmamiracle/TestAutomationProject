//package selenium_tutorial;
//
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import org.web.automation.entryBehaviour.EntryBehaviour;
//
//public class Tc_001_Textbox extends EntryBehaviour{ 
//	
//
//
//		
//		@Test
//		public void tc001() throws InterruptedException {
//	     driver.findElement(By.name("fld_username")).sendKeys("Chidinma"); // sendkeys functionality is use to send the value of an element
//	     driver.findElement(By.name("fld_username")).clear(); //The clear functionality is use to reset the value of an element
//	     driver.findElement(By.name("fld_username")).sendKeys("Miracle");
//	     driver.findElement(By.name("fld_email")).sendKeys("pasmiracle93@gmail.com");
//	     driver.findElement(By.name("fld_password")).sendKeys("Miracle051990");
//	     driver.findElement(By.name("fld_cpassword")).sendKeys("Miracle051990");
//	     driver.findElement(By.name("dob")).sendKeys("5/18/1990");
//	     driver.findElement(By.name("phone")).sendKeys("6153356558");
//	     driver.findElement(By.name("address")).sendKeys("760 dover glen drive");
//	     
//	     driver.findElement(By.name("state")).sendKeys("Tennesse");
//	     driver.findElement(By.name("city")).sendKeys("Nashvile");
//	     driver.findElement(By.name("zip")).sendKeys("37013");
//	     driver.findElement(By.xpath("//input[@value='Sign up']")).click();// Click functionality forces a new page to load, Buttons
//	    // driver.findElement(By.xpath("//a[text()='Read Detail']")).click();// Links
//     driver.findElement(By.xpath("//input[@name='add_type' or value='home']")).click();// Radio Button
//	     driver.findElement(By.name("terms")).click();// CheckBox
//	     
//	     
//	     //To work on any dropdwn we use the select key,hence that is the element by creating an object for it befoe finding the element
//	     //The same approach also works on the list,the only difference is that the list can be deselected, while dropdown cannot be deselected
//	     Select country = new Select(driver.findElement(By.id("countryId")));
//	     //There are various approaches to select a dropdown
//	     //country.selectByIndex(50);// This return an index that you choose in form of a number
//	    // country.selectByValue(null);// This will return a number but in a string format
//	     country.selectByVisibleText("United States");// Here you have to maunally type in the country you want
//	     System.out.println(country.getFirstSelectedOption().getText());//Print only selected option in the tag
//	     Thread.sleep(5000);
//	     
//	    // List<WebElement>option = country.getAllSelectedOptions(); //This will list all the selected options and is use on List items
//	     List<WebElement>option = country.getOptions();//List all available options belonging to the selected tag
//	     for (WebElement a : option) {
//	    	 System.out.println(a.getText());
//			
//		}
//
//	     
//	     Select gender = new Select(driver.findElement(By.name("sex")));
//	     gender.selectByVisibleText("Female");
//		}
//		
//}
//
//
