import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/upload");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
WebElement file = driver.findElement(By.xpath("//input[@id='file-upload']"));
file.sendKeys("C:\\Users\\HP\\Downloads\\sodapdf-converted (2).pdf");
driver.findElement(By.xpath("//input[@id='file-submit']")).click();


	}

}
