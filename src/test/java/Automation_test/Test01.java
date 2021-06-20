package Automation_test;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.ImagePath;
import org.testng.Assert;

public class Test01 {

	public static void main(String[] args)throws Exception,StaleElementReferenceException
	{
    
		int temp=0;
		
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
	
	List<WebElement> tNumber= driver.findElements(By.xpath("//a[@class='paginate_button ']"));
	
	
	   
	
	
	
	for(WebElement tn:tNumber)
	{
		List<WebElement> checkBox1= driver.findElements(By.xpath("(//table)[1]//td[text()='San Francisco']/parent::tr//td[@class=' select-checkbox']"));
		
		for(WebElement clickOnBox:checkBox1)
		{
			clickOnBox.click();
			Thread.sleep(2000);
		}
		for(int i=0;i<6;i++)
		{
		tn.click();
List<WebElement> checkBox2= driver.findElements(By.xpath("(//table)[1]//td[text()='San Francisco']/parent::tr//td[@class=' select-checkbox']"));
		
		for(WebElement clickOnBox:checkBox2)
		{
			clickOnBox.click();
			Thread.sleep(2000);
		}
		}
	}
	   
	
	
	
	Thread.sleep(3000);
	
	driver.quit();
	
	  
	  
	}

}
