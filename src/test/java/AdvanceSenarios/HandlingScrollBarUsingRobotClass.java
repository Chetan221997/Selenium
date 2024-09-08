package AdvanceSenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingRobotClass {

	public static void main(String[] args) throws Throwable {
		
		//Handling Scroll bar using Robot Class
		
		//Handling Scroll bar using JavaScriptExecutor
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);

	}

}
