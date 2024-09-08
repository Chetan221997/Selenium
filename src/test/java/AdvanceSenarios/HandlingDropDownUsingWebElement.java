package AdvanceSenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingWebElement {
	public static void main(String[]args ) throws Throwable {

	WebDriver driver= new ChromeDriver();
	driver.get("\"https://www.facebook.com/\"");
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
Thread.sleep(4000);






	}


}




