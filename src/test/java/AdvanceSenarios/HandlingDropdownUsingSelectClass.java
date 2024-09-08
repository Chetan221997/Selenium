package AdvanceSenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownUsingSelectClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		
		//In select class we have three approach
		//*select by index
		//*select by value
		//*select by visibleText
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
Thread.sleep(4000);

WebElement dayList = driver.findElement(By.id("day"));

Select select = new Select(dayList);

//select.selectByIndex(9);
select.selectByVisibleText("9");
 Thread.sleep(4000);
   WebElement monthList = driver.findElement(By.id("month"));
		Select select1= new Select(monthList);
		//select1.selectByIndex(11);
		select1.selectByVisibleText("11");
		
		Thread.sleep(4000);
		WebElement yearList = driver.findElement(By.id("year"));
		Select select2= new Select(yearList);
		//select2.selectByIndex(24);
		select2.selectByVisibleText("24");

	}

}
