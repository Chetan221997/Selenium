package demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i phone");
driver.findElement(By.cssSelector("[viewBox='0 0 24 24']")).click();

int count=0;
List<WebElement> names = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	List<WebElement> phnprice = driver.findElements(By.xpath("// div [@class='Nx9bqj _4b5DiR']"));

	// below is for getting phone names in flipcart
for(WebElement phnname:names) {
	System.out.println(phnname.getText());
	count++;
}
	System.out.println("total num of phones name:" + count);
	
	//below is for getting price of the phone
	for (int i=0; i<phnprice.size();i++)
	{
		
		System.out.println(phnprice.get(i).getText());
	}


}



}
