package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();

 Set<String> allWins = driver.getWindowHandles();//win1,win2

 for (String win: allWins)
 {
		driver.switchTo().window(win);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Selenium"))
		{
			break;
		}
	}
 driver.findElement(By.linkText("Register now!")).click();
 

Set<String> allWins1 = driver.getWindowHandles();//win1,win2,win3

for (String win1: allWins1)
{
		driver.switchTo().window(win1);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Appium Conf 2024"))
		{
			break;
		}
	}
driver.findElement(By.xpath("//a[text()='View Details']")).click();
//driver.close();
//driver.quit();
//-------------------------------------------------------------------------------------------------------------------------------------
//close first window



	}
	}


