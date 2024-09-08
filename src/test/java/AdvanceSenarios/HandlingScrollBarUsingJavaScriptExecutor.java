package AdvanceSenarios;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandlingScrollBarUsingJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	for(int i=0; i<7; i++)
	{
	js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
}

	for(int i=0; i<5; i++)
{
		
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
	}
		
		//with the help of coordinates x axis and y axis
	
	
	
//	JavascriptExecutor jav = (JavaScriptExecutor) driver;
//	
//	for()i=0; i<7;i++)
//{
	js.executeScript("Window.scrollBy(0,500)");
//	}
	
	JavascriptExecutor jav = (JavaScriptExecutor) driver;

//	for()i=0; i<7;i++)
//{
//	js.executeAsyncScript(Window.scrollBy(0.500);
//	}
	
	}}
