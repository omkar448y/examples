package pro;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Intel_IPA 
{
	//TO Automate Intel IPA Chat Bot Page 
	
	public static void main(String args[]) throws IOException 
	{
	//To Call Setproperty method and is present in system class and create object of the WebDriver	
	    System.setProperty("webdriver.chrome.driver", 
				  "D:\\Chrome1\\chromedriver_win32\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.intel.com/content/www/us/en/partner-alliance/overview.html");
		
		//To click onn the Chatbutton icon
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='avaamo__icon']")).click();
		
		
		driver.switchTo().frame("avaamoIframe");
		System.out.println("Changed selenium focuse to frame");
		//To take screen shot
		//File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File dec=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\File\\omkarIPA.jpg");
		//FileHandler.copy(Src, dec);
		//to click on persistence menu list
		
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dec=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\File\\omkarIPA1.jpg");
		FileHandler.copy(src,dec);
		driver.findElement(By.xpath("//button[@data-ele-name='switch_menu']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
