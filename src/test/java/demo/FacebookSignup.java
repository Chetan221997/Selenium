package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(4000);
WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
name.sendKeys("Chetan",Keys.TAB,"S",Keys.TAB,"9901936231",Keys.TAB,"Chetan@1997");

WebElement day = driver.findElement(By.id("day"));

Select select = new Select(day);
select.selectByVisibleText("9");
Thread.sleep(4000);
WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
Select select1= new Select(month);
select1.selectByVisibleText("Jan");
Thread.sleep(4000);
WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
Select select2=new Select(year);
select2.selectByVisibleText("2005");
Thread.sleep(3000);

driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();




	}

}
