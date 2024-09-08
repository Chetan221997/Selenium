package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i phone");
		//driver.findElement(By.cssSelector("[viewBox='0 0 24 24']")).click();
	}

}
