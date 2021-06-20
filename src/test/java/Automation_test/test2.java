package Automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.location='http://demo.guru99.com/test/newtours/'");
		
		js.executeScript("window.history.back()");
		
		js.executeScript("window.history.forward()");
		
		js.executeScript("window.location.reload()");
		
		String title=(String)js.executeScript("return document.title");
		
		System.out.println(title);
		
        String url=(String)js.executeScript("return document.URL");
		
		System.out.println(url);
	
		
		driver.quit();
	}
}
