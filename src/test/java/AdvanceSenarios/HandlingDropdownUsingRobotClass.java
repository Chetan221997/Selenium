package AdvanceSenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownUsingRobotClass {

	public static void main(String[] args) throws Throwable {
	

			
			//handling dropdown using keyboard strokes-----> keys class and robot class
			//handling dropdown using select class
			//handling dropdown using webelement
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(4000);
			
			WebElement dayList = driver.findElement(By.id("day"));
			dayList.click();
			
			Robot rob = new Robot();
			
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
	
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			
			rob.keyPress(KeyEvent.VK_UP);
			rob.keyRelease(KeyEvent.VK_UP);
	
	}

}
