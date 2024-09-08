package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		
		//first we need to switch for top frame and frome top frame we can switch to other frames in topframe
		WebElement topFrame = driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
		driver.switchTo().frame(topFrame);
		
		
		driver.switchTo().frame("frame-left");
		String leftFrame = driver.findElement(By.xpath("//body[contains(text(),' LEFT')]")).getText();
		System.out.println(leftFrame);
//		
//		driver.switchTo().parentFrame();
//		String middle = driver.findElement(By.xpath("//frame[@name='frame-middle']")).getText();
//		driver.switchTo().frame("frame-middle");
//		System.out.println("middle");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		String bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(bottom);
		
		
		
		
		


	}

}
