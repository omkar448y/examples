package pro;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Intel_GCS
{
	public static void main(String args[]) {
	
		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "D:\\Chrome1\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		   WebDriver driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    
		    //To click on Create new Account button
		    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		    //Apply implicitly wait and enter First/Last name/ Mobile No/ Password name into text field
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
	
				
				
			
		    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Omkar");
		    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("YAdav");
		    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("omkaryadav448@gmail.com");
		    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Omkar@123");
		    
		  // To Handle Dropdown By Using select class
		    WebElement drop1=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		    Select drop=new Select(drop1);
		    drop.selectByVisibleText("22");
		    
		    
		 // Select month By using Select class   
		    WebElement Drop1=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		    Select Month=new Select(Drop1);
		    Month.selectByVisibleText("Jan");
		 
		 //Select year By using Select Class
		    WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));  //birthday_year
		    Select drop3=new Select(year);
		    drop3.selectByVisibleText("2019");
		  // Assert.assertEquals("Year selection test is pass", false, false); 
		 // To select male 
		    driver.findElement(By.xpath("//label[text()='Male']")).click();
		    
		 // TO click on Sign up button
		    driver.findElement(By.xpath("//div[@class='_1lch']//button[text()='Sign Up']")).click();

	}}

	


