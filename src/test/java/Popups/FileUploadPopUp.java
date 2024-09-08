package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
driver.manage().window().maximize();
driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\vtiger.txt");

driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
	}


		

	}


