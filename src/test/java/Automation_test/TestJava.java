package Automation_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestJava {

	public static void main(String[] args)throws Exception {
		
		WebDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("mobile");
		Thread.sleep(2000);
		
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='POCO C3 (Arctic Blue, 32 GB)']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		for(String windowId:windowIDs)
		{
			if(driver.switchTo().window(windowId).getTitle().equals("POCO C3 ( 32 GB Storage, 3 GB RAM ) Online at Best Price On Flipkart.com"))
			break;
		}
		
		
	   WebElement Image=driver.findElement(By.xpath("(//div[@class='q6DClP'])[2]"));
	   
	   action.moveToElement(Image).perform();
	   Thread.sleep(2000);
	   action.sendKeys(Keys.PAGE_DOWN).perform();
	   
	   driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("210986");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("8018304365");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("373ma239");
	   
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
	   
	   driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("SAMBIT KUMAR SWAIN");   //Name
   Thread.sleep(2000);
	   
	  driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8018304365");   //Mobile Number
	   Thread.sleep(2000);
	   
	  driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("500038");   //Pincode
   Thread.sleep(2000); 
	   
  driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Hyderabad");  //Locality
   Thread.sleep(2000);
	   
     driver.findElement(By.xpath("//textarea[@name='addressLine1']")).sendKeys("SR Nagar,Near Andhra Bank,Hyderabad,Telangana,India");    //Address
	   
	  driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hyderabad");   //City
	   
	   WebElement state=driver.findElement(By.xpath("//select[@name='state']"));
	   
	  Select s=new Select(state);
	  s.selectByValue("Telangana");
	   
	   
	  driver.findElement(By.xpath("(//div[@class='_1XFPmK'])[2]")).click();  //Address Type Radio Button
	   
	  driver.findElement(By.xpath("//button[text()='Save and Deliver Here']")).click();	   
	   Thread.sleep(2000);
	   
	  driver.findElement(By.xpath("//button[text()='Deliver Here']")).click();
	   
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//input[@placeholder='Enter your email ID']")).sendKeys("sam123@jadk.jdd");
	  
	  driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
	  Thread.sleep(2000);
	  
	  
	   
	   
	   
	   
     
		//driver.quit();
		
	}

}
