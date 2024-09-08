package AdvanceSenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokesUsingKeysClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		//Two Approches:
		// 1) *Keys Class------> Static methods
		// 2) *Robot class-------> Non Static Methods
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	//	case1: 
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
	//username.sendKeys("standard_user",Keys.TAB);
		
		
		
		//driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);
		
		
		//case2: 
		
	//	driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		
		//Robot Class:
		
		Robot rod = new Robot();
		
		rod.keyPress(KeyEvent.VK_CONTROL);
		rod.keyPress(KeyEvent.VK_A);
		rod.keyRelease(KeyEvent.VK_CONTROL);
		rod.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(1000);
		
		rod.keyPress(KeyEvent.VK_CONTROL);
		rod.keyPress(KeyEvent.VK_C);
		rod.keyRelease(KeyEvent.VK_CONTROL);
		rod.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(1000);
		
		rod.keyPress(KeyEvent.VK_TAB);
		rod.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);
		
		rod.keyPress(KeyEvent.VK_CONTROL);
		rod.keyPress(KeyEvent.VK_V);
		rod.keyRelease(KeyEvent.VK_CONTROL);
		rod.keyRelease(KeyEvent.VK_V);
		
	

	}

}
