package Automation_test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Alert_Tricks {
	
	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert accepting
		
	   /* driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	    Thread.sleep(2000);
	    
	    driver.switchTo().alert().accept(); */
	    
	    //Alert accepting & dismissing
	    
	 /*   driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	    Thread.sleep(2000);
	    
	    //driver.switchTo().alert().accept();
	    
	    driver.switchTo().alert().dismiss(); */
	    
	
		 //Passing value in Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alertHandle = driver.switchTo().alert();
		
		System.out.println(alertHandle.getText());
		
		alertHandle.sendKeys("Jay Shree Ram");
		
		alertHandle.accept();
	}

}
