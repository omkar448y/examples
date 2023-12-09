package pro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup 
{
	
	public static void main (String args[]) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("hello guru");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	Alert a1=driver.switchTo().alert();
		
		a1.accept();
		
		
	}
	

}
