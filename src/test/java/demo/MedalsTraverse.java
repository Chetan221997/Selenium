package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MedalsTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://olympics.com/en/paris-2024/medals?AnonymousID=6b3a60c7-2425-4291-8ffa-a8de18b67621&displayAsWebViewdark=true&displayAsWebView=true");
		WebElement gold = driver.findElement(By.xpath("//span[text()='United States of America']/../following-sibling::span[@class='e1oix8v91 emotion-srm-81g9w1'][1]"));
System.out.println(gold.getText());
	}

}
