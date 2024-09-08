import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise {

	
	
	WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sudeep songs");
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	driver.findElement(By.xpath("//a[@title='Ra Ra Rakkamma Full Video Song [Kannada] | Vikrant Rona | Kichcha Sudeep | Jacqueline Fernandez|Anup']")).click();

{
	}
	 
	}
}
