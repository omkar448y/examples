package pro;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FB_Automation 
{
public static void main(String args[]) throws IOException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome1\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//To provoiod the implicitly wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//To clcik on create new Account button
	
	driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
	
	// to enter First name 
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Omkar");
	// To enter last name
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yadav");
    //To enter Email or Mibile Number
    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Omkaryadav93098");
    // To Enter password 
    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Omkar2123"); 
    
    // To handle Drop Down and select date
    WebElement dr1=driver.findElement(By.xpath("//select[@name='birthday_day']"));
    Select drop=new Select(dr1);
    drop.selectByValue("2");
    
    
   WebElement dr2= driver.findElement(By.xpath("//select[@name='birthday_month']"));
   Select drop2=new Select(dr2);
   drop2.selectByValue("Feb");
   
  WebElement dr3= driver.findElement(By.xpath("//select[@name='birthday_year']"));	
  Select drop3=new Select(dr3);
  drop3.selectByValue("2022");
	// To take A ScreenShot 
  File p2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  File dec=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\File\\sample3.jpg");
FileHandler.copy(p2, dec);

// To handle Alert pop up
Alert al=driver.switchTo().alert();

al.accept();
al.dismiss();
String text=al.getText();
System.out.println(text);


// To handle Window popup


Set<String> ids=driver.getWindowHandles();
ArrayList<String> list=new ArrayList<String>(ids);

String main=list.get(0);
String child=list.get(1);
driver.switchTo().window("main");
//Then perform Athe Act
















}	
	
	
	
	
	

}
