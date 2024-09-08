package AdvanceSenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		
	//driver.get("https://www.amazon.in");
	
	
	//Overhing the mouse to the particular element
//	WebElement ele = driver.findElement(By.linkText("Today's Deals"));
//	Actions act = new Actions(driver);
//	act.moveToElement(ele).perform();
	
	// Right click on the element
//	WebElement link = driver.findElement(By.linkText("Mobiles"));
//	Actions act1 = new Actions(driver);
//	act1.contextClick(link).perform();
	
	//Sendkeys using action class
//	driver.get("https://www.saucedemo.com/");
//WebElement USERNAME = driver.findElement(By.id("user-name"));
//WebElement PASSWORD = driver.findElement(By.name("password"));
//WebElement LOGIN = driver.findElement(By.name("login-button"));

//Actions act2 = new Actions(driver);
//act2.sendKeys(USERNAME, "standard_user").perform();
//act2.sendKeys(PASSWORD, "secret_sauce").perform();
//act2.click(LOGIN).perform();

//sendkeys using multipule value with build() method 
//act2.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD, "secret_sauce").click(LOGIN).build().perform();

//Drag and Drop: here we have two Approach 
		
		//Approach1:
//		driver.get("");
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		Actions act = new Actions(driver);
//		act.clickAndHold(drag).release(drop).perform();
//		
//		//Approch2:
//		act.dragAndDrop(drag, drop).perform();
		
		//double click
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		 Actions act = new Actions(driver);
//		 act.doubleClick(ele).perform();
		
		//moveByoffset
//		 driver.get("https://www.makemytrip.com");
//		 Actions act = new Actions(driver);
//		 act.moveByOffset(10, 20).click().perform()
		
		//context click(): rightclick
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	 //Actions act = new Actions(driver);
//act.contextClick().perform();
		
		//clickAndHold : ussed to perform click and hold scenarios
		
	//release : this method is used to release the holded element
		
	}
	

}
