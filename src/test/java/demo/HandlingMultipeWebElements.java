package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingMultipeWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	
	for (WebElement link : allLinks)
	{
		System.out.println(link.getText());
	}
//int count = 0;
//count++;
	}

}
