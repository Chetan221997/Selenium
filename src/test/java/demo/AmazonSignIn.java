package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignIn {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

		
//		
		WebElement ele = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
	Thread.sleep(5000);
	WebElement phone = driver.findElement(By.xpath("//input[@id='ap_email']"));
	phone.sendKeys("9901936231",Keys.ENTER);

	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Chetan@1997",Keys.ENTER);

}}
