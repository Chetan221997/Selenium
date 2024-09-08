package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopup {

	@Test
	public  void AlertPopupTest()
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://the-Internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
	//approch 1 :to click on "ok" button in popup
		//type1:
	driver.switchTo().alert().accept();
		
		//type2:
			Alert alert = driver.switchTo().alert();
			alert.accept();
		
		//approch2: to click on "cancel"
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		
		//approch 3: by sending keys in the popup and click on ok or click on cancel
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("good");
		driver.switchTo().alert().accept();
		
		//fetcing text in the alert popup
				driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
				Alert alt = driver.switchTo().alert();
				String text = alt.getText();
				System.out.println(text);
		
		
		
		
		

	}

}
