package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNativePopUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opp = new ChromeOptions();
		opp.addArguments("--incognito");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");

	}

}
