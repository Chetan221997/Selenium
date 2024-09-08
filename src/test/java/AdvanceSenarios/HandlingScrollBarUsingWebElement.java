package AdvanceSenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	//	Approch 1:
		WebElement 	ele = driver.findElement(By.xpath("//a[text()='Help']"));
		
	Point loc = ele.getLocation();
	System.out.println(loc.getX());
	System.out.println(loc.getY());

	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(310, 825)");
	Thread.sleep(3000);
	ele.click();

	//	Approch 2
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("arguments[0].scrollIntoView()",ele);
	Thread.sleep(3000);
	ele.click();


	}

}
