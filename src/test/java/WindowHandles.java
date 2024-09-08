import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("i phone",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Apple iPhone 15 (Black, 128 GB)']")).click();
		
		String mainID = driver.getWindowHandle();
		System.out.println(mainID);
		
		Set<String> allID = driver.getWindowHandles();
		System.out.println(allID);
		
		for(String id:allID)
		{
			
			if(!mainID.equals(id))
			{
				driver.switchTo().window(id);
				String phn = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
				System.out.println(phn);
			}
		}

	}

}
