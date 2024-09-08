import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//using index
//		driver.get("https://jqueryui.com/droppable/");
//driver.switchTo().frame(0);
//WebElement drag = driver.findElement(By.id("draggable"));
//WebElement drop = driver.findElement(By.id("droppable"));
//Actions act = new Actions(driver);
//act.dragAndDrop(drag, drop).perform();

		//using index

//driver.get("https://demo.automationtesting.in/Frames.html");
////driver.switchTo().frame(1);
////WebElement frame = driver.findElement(By.xpath("//input[@type='text']"));
////frame.sendKeys("cgetam");
//driver.switchTo().frame("SingleFrame");
//WebElement frame = driver.findElement(By.xpath("//input[@type='text']"));
//frame.sendKeys("Hu");
		
		
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.linkText("Nested Frames")).click();
	WebElement topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
	driver.switchTo().frame(topframe);
	
	driver.switchTo().frame("frame-left");
	String left = driver.findElement(By.xpath("//body[contains(text(),' LEFT')]")).getText();
	System.out.println(left);
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame("frame-middle");
	String middle = driver.findElement(By.xpath("//frame[@name='frame-middle']")).getText();
	System.out.println(middle);
	
	

	}

}
