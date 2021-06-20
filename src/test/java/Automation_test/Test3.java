package Automation_test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args)throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		uname.clear();
		uname.sendKeys("admin");
		
		WebElement pwd= driver.findElement(By.xpath("//input[@name='password']"));
		pwd.clear();
		pwd.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Sales']")).click();
		driver.findElement(By.xpath("//a[text()='Orders']")).click();
		
		String text = driver.findElement(By.xpath("//div[text()='Showing 1 to 20 of 8531 (427 Pages)']")).getText();
		
		int a= text.indexOf("(");
		
		int b= text.indexOf("Pages");
		
	   int total_pages = 	Integer.valueOf(text.substring(a+1, b-1));
		
	   System.out.println("Total number of pages : "+ total_pages);
	   
	   
	   for(int p=1;p<=total_pages;p++)
	   {
		   WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
		   
		   System.out.println("Active page number : "+ active_page.getText());
		   
		   active_page.click();
		   
		   int row = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		   
		   System.out.println("total number of rows for this active page : "+ row);
		   
		   for(int r=1;r<row;r++)
		   {
			   String OrderID = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			   String Customer = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
			   String Status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
			   
			   System.out.println(OrderID+" "+Customer+"     "+Status);
		   }
			
		   String ps=Integer.toString(p+1);
	   
	     WebElement inactive_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+ps+"']"));
	     
	     inactive_page.click();
	   
	   
	   
	   
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
           driver.quit();

	}

}
