package AdvanceSenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		//handling dropdown using keyboard strokes-----> keys class and robot class
		//handling dropdown using select class
		//handling dropdown using webelement
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(5000);
WebElement dayList = driver.findElement(By.xpath("//select[@id='day']"));
		dayList.click();
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		dayList.sendKeys(Keys.ARROW_UP);
		dayList.sendKeys(Keys.ARROW_UP);
	}

}
 
