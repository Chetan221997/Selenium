package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bigbasket.com/");
		
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Apples");
		
		Thread.sleep(2000);
		List<WebElement> allEles = driver.findElements(By.xpath("//div[@class='//ul[@class='overscroll-contain']"));

		for (WebElement ele : allEles)
		{
			Thread.sleep(2000);
			System.out.println(ele.getText());
			if(ele.getText().contains("Apple - Royal Gala Economy"))
			{
				ele.click();
				break;
			}
		}
	
	}

}