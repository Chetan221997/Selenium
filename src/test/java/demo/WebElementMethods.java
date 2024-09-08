package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
	//	driver.get("https://www.saucedemo.com/");
		
		
		//method1-sendkeys()
	//WebElement username = driver.findElement(By.name("user-name"));
	//	username.sendKeys("standard_user");
		
		
		//method2-clear()
	//	Thread.sleep(2000);
	//	username.clear();
		
	//	username.sendKeys("standard_user");
		
	//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		
		//method 3-get css value : anything related to styles we go for css value
		//driver.get("https://www.flipkart.com/");
		//WebElement name = driver.findElement(By.xpath("//img[@alt='Top Offer']"));
	//System.out.println(name.getCssValue("color"));
	
		//method 4- getsize() , get height and width of element
		//WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		//System.out.println(search.getSize().getHeight());
		//System.out.println(search.getSize().getWidth());
		
		//method 5- getRect()- combination of location and size
	//	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	//System.out.println(search.getRect().getX());
//	System.out.println(search.getRect().getY());
//	System.out.println(search.getRect().getHeight());
//	System.out.println(search.getRect().getWidth());
		
		//method 6- isDisplayed
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		if(search.isDisplayed())
		{
			System.out.println("ele,ment is displayed");
		}
		else
		{
			
			System.out.println(" element not displayed");
		}
		
		
	//	if(search.isDisplayed())
	//	{
		//	System.out.println("Element is displayed");
	//	}
	//	else
	//	{
	//		System.out.println("Element not displayed");
	//	}
	//method 7- isEnabled
//WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		
	//	if(search.isEnabled())
	//	{
	//		System.out.println("Element is enabled");
	//	}
	//	else
	//	{
	//		System.out.println("Element not enabled");
		//}
		//method 8 - isSelected
	//	driver.get("https://www.facebook.com/");
	//	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	//	Thread.sleep(2000);
	//WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
	//	radio.click();
	//	if(radio.isSelected())
	//	{
	//		System.out.println("radio button is selected");
	////	}
	//	else
	//	{
	//		System.out.println("radio button is not selected");
	//	}
	driver.get("https://www.flipkart.com/");
//Method 9: getAttribute()
	//getDomAttribute()
	//getDomProperty
	
	//getAttribute
//	WebElement searchbar = driver.findElement(By.name("q"));
	
//	System.out.println(searchbar.getAttribute("class"));
	
	//method 10
	//getDomAttribute//===> Document object model: which describe what content html code have
//WebElement textbar = driver.findElement(By.name("q"));
	
//System.out.println(textbar.getDomAttribute("title"));
	
	
	//getDomProperty
	
//WebElement textbar = driver.findElement(By.name("q"));
	
	//System.out.println(textbar.getDomProperty("inherit"));
	
	
	
	
	//method 11: getTagName
	
	//WebElement searchbr = driver.findElement(By.name("q"));
	//System.out.println(searchbr.getTagName());
	
	//method 12: getAccessibleName
	//WebElement searc = driver.findElement(By.name("q"));
	//System.out.println(searc.getAccessibleName());
	
	//Method 13: getAriaRole
	//WebElement Arial = driver.findElement(By.cssSelector("img[alt='Top Offer']"));
	//System.out.println(Arial.getAriaRole());
	
	//method 14:  submit
	
	//method 15: getText()
	
	//method 16: getLoction()
	
	//getScreenshot()
	
	WebElement flip = driver.findElement(By.cssSelector("img[title='Flipkart']"));
	flip.getLocation())
		System.out.println(flip.isDisplayed());
			
	}
	
	
	
	
	

}
