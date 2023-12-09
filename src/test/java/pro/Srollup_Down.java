package pro;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Srollup_Down {
	
public static void main(String[] args) {
	
	 // Setup WebDriver using WebDriver Manager
    WebDriverManager.chromedriver().setup();
    // Create ChromeOptions
  //  ChromeOptions chromeOptions = new ChromeOptions();

    // Add arguments to ChromeOptions
   // chromeOptions.addArguments("--start-maximized"); // Maximize the browser window on startup
   // chromeOptions.addArguments("--disable-notifications"); 

    // Initialize WebDriver
    WebDriver driver = new ChromeDriver();

    // Open a webpage
    driver.get("https://www.w3schools.com/");
	
	// Create a JavascriptExecutor object
    JavascriptExecutor js = (JavascriptExecutor) driver;

    // Scroll down by 500 pixels
    js.executeScript("window.scrollBy(0, 500);");

//    // Find a WebElement (for example, a specific element you want to scroll to)
//    WebElement scrollElement = driver.findElement(By.id("elementId")); // Replace with your own locator
//
//    // Create an Actions object
//    Actions actions = new Actions(driver);
//
//    // Scroll to the WebElement
//    actions.moveToElement(scrollElement);
//    actions.perform();
//}
	
	
	
	
	
}}
