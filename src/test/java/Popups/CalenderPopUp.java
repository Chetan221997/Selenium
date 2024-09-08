package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
		Actions action = new Actions(driver);
		action.moveByOffset(10, 20).click().perform();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='September 2024']/../..//p[text()='5']")).click();
		// driver.findElement(By.xpath("//div[text()='September 2024']/ancestor::div[@class='DayPicker-Month']//p[text()='10']")).click();
		
		//	driver.findElement(By.xpath("//div[text()='September 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='7']")).click();
		//Dynamic xpath:- The path remains same, any value changes should be done outside the path.
				String month = "August 2024";
				String date = "30";
				driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
		

	}

}
