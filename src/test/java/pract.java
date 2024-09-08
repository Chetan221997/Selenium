import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
//	driver.get("https://www.saucedemo.com/");
//	//send keys
//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	WebElement pass = driver.findElement(By.id("password"));
//	pass.sendKeys("secret_sauce");
//	//clear()
//	//pass.clear();
//	
//	//click()
//	driver.findElement(By.id("login-button")).click();
		//getcssvalue
	//	driver.get("https://www.amazon.in/");
//		WebElement ele = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
//	System.out.println(ele.getCssValue("color"));
		
		
		//getlocation and getsize and getreact
//	WebElement loc = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//	System.out.println(loc.getLocation().getX());
//	System.out.println(loc.getLocation().getY());
//	System.out.println(loc.getRect().getHeight());
//	System.out.println(loc.getRect().getWidth());
		
		//is displayed
//		WebElement displayed = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//		if(displayed.isDisplayed())
//		{
//			System.out.println("Link is displayed");
//		}
//		else
//		{
//			System.out.println("link is not displayed");
//		}
	
		//is enabled
//	WebElement enabled = driver.findElement(By.name("field-keywords"));
//	
//	if{enabled .isEnabled();
//		enabled.sendKeys("nike");
//		
//	}
//	else
//	{
//		System.out.println("is not enabled");
//	}
		
		driver.get("https://www.flipkart.com/");
		WebElement attri = driver.findElement(By.name("q"));
System.out.println(attri.getAttribute("class"));
System.out.println(attri.getTagName());
System.out.println(attri.getAriaRole());
System.out.println(attri.getAccessibleName());
	}

}
