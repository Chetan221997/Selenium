package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
         //using window id;
		//using window title
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("i phone",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Apple iPhone 15 (Black, 128 GB)']")).click();
		
		String mainId = driver.getWindowHandle();//win1
		System.out.println(mainId);
		
		Set<String> allIDs = driver.getWindowHandles();
		System.out.println(allIDs);
		
		
		
		for(String id: allIDs)
		{
			if(!mainId.equals(id))
			{
				driver.switchTo().window(id);
				String phn = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
				System.out.println(phn);
			}
		}
		
		
		
		
		

	}

}
