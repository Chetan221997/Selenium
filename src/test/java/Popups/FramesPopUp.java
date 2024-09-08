package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
	//	driver.get("https://jqueryui.com/droppable/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	   // approch1: switching to frame by 'ID"
	    
	   // driver.switchTo().frame(0);
	    
	    
//	    WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		
//		Actions act = new Actions(driver);
//		act.dragAndDrop(drag, drop).perform();
		
		//approch 2: switcing to multiple frames using tables
	  //  driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.switchTo().frame(0);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("input[@type='text']")).sendKeys("qspider");
		
		//approch3; swtching to frame using "ID Attributes"
//		driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("input[@type='text']")).sendKeys("hi");
		
		//approch3; swtching to frame using "Name Attributes"
		//driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("//input[@typr='text']")).sendKeys("hello");
		
		
		//approch 4: switching frame using webelement
		//driver.get("https://demo.automationtesting.in/Frames.html");
//		WebElement frame = driver.findElement(By.cssSelector("[id='singleframe']"));
//driver.switchTo().frame(frame);
//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hey");
	    
		 
	   
	}

}
