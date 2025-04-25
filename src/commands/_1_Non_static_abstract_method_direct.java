package commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_Non_static_abstract_method_direct {
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
	

	}
}
