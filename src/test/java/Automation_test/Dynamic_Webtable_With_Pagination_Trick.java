package Automation_test;

import java.awt.print.PrinterGraphics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Webtable_With_Pagination_Trick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));
		UserName.clear();
		UserName.sendKeys("admin");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.clear();
		Password.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Sales']")).click();
		
		driver.findElement(By.xpath("//a[text()='Orders']")).click();
		
		String textData = driver.findElement(By.xpath("//div[text()='Showing 1 to 20 of 8531 (427 Pages)']")).getText();
		
		int a= textData.indexOf("(");
		
		int b = textData.indexOf("Pages");
		
	int total_Pages =	Integer.valueOf(textData.substring(a+1,b-1));
		System.out.println("Total Number of pages : "+total_Pages);
		
		
		
		for(int p=1;p<=total_Pages;p++)
		{
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Page Number : "+ active_page.getText());
			active_page.click();
			
			int row = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("Total number Of rows in this page : "+ row);
			
			
			for(int r=1;r<=row;r++)
			{
				String OrderID = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String Customer = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
				
				System.out.println(OrderID+"     "+Customer+"      "+status);
			}
			String s= Integer.toString(p+1);
			WebElement InactivePage = driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+s+"']"));
			
			InactivePage.click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
