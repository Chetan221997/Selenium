package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.findElement(By.cssSelector("[name='q']")).sendKeys("iphone15");
driver.findElement(By.cssSelector("[viewBox='0 0 24 24']")).click();

// approch 1
//String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
//System.out.println(price);

//second approach
}
}
////span[text()='Apple iPhone 13 (128GB) - Pink']/../../../../..//div[5]/div[1]/div[1]
