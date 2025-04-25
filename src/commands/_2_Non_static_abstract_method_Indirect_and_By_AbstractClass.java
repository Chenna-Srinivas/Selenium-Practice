package commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class _2_Non_static_abstract_method_Indirect_and_By_AbstractClass {
public static void main (String [] args) {

	WebDriver driver = new ChromeDriver();
	
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
