package demo;
import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbymultipleattributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//input [@class='Pke_EE' and @placeholder='Search for Products, Brands and More']")).sendKeys("puma");
	}

}
