package commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Non_static_abstract_method_direct {
	static String url = "https://www.google.co.in/";
	
	public static void main (String args []) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		
		// Return type: Void
		driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();
		String windowHandle = driver.getWindowHandle();
		
		//Return type: Set<String> windowHandles =  
//		driver.getWindowHandles();
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		
	//	Return type: Navigation, It is an Interface which contains 4 methods
		//driver.navigate();
		driver.navigate().to(url);
		
		// Return type: Void
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
		//driver.switchTo(); Return type: Target Locator
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.close();
		//driver.quit();
	
		// findElement(); RT is WebELemet
	// By: It is an Abstract class which consists of 8 static methods	
		driver.findElement(By.id(null));
		driver.findElement(By.name(null));
		driver.findElement(By.className(null));
		driver.findElement(By.linkText(null));
		driver.findElement(By.partialLinkText(null));
		driver.findElement(By.tagName(null));
		driver.findElement(By.cssSelector(null));
		driver.findElement(By.xpath(null));
		
		/*Selenium provides 8 types of Locators used to identify the elements in webpage
		 id name className linkText partialLinkText - Direct Locators
		cssSelector xpath - Expressions
		*/
		
	}
}
