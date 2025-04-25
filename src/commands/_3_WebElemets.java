package commands;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _3_WebElemets {
 public static void main (String [] args) {
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.findElement(By.id(null)).sendKeys(args);
	 driver.findElement(By.id(null)).click();
	 driver.findElement(By.id(null)).clear();
	 driver.findElement(By.id(null)).submit();
	 
	 String text = driver.findElement(By.id(null)).getText();
	 String attribute = driver.findElement(By.id(null)).getAttribute(null);
	 String cssValue = driver.findElement(By.id(null)).getCssValue(null);
	 String tagName = driver.findElement(By.id(null)).getTagName();	 
	 
	 Dimension size = driver.findElement(By.id(null)).getSize();
	 Point location = driver.findElement(By.id(null)).getLocation();
	 Rectangle rect = driver.findElement(By.id(null)).getRect();
	 
	 boolean selected = driver.findElement(By.id(null)).isSelected();
	 boolean displayed = driver.findElement(By.id(null)).isDisplayed();
	 boolean enabled = driver.findElement(By.id(null)).isEnabled();
 }
}
