package Automation_test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecuteDemo {

	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//syntax
		
		
		
		//flsah
		WebElement logoNop=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		JavaScriptUtil.flash(logoNop, driver);
		
		//Drawing border & take screenshot
//		WebElement logoNop=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		JavaScriptUtil.drawBorder(logoNop, driver);
//
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File srcJ= ts.getScreenshotAs(OutputType.FILE);
//		File  trgJ=new File(".\\ScreenShotStore\\logoj.png");
//		FileUtils.copyFile(srcJ, trgJ);
//		
		//Getting title of the page
//		
//		String titleDemo=JavaScriptUtil.getTitleBYJS(driver);
//		System.out.println(titleDemo);
//		
		
		//click action
//		WebElement reLink=driver.findElement(By.linkText("Register"));
//		JavaScriptUtil.cickElementByJS(reLink, driver);
//		
		//Generate alert
//		
//		JavaScriptUtil.alertwindow(driver, "Testing");
//		
		//scroll up page
		
//		JavaScriptUtil.scrollPageUp(driver);
//		
//		Thread.sleep(3000);
//		//scroll down page
//		JavaScriptUtil.scrollPageDown(driver);
//		
		//zoom page
//		JavaScriptUtil.zoomPageByJS(driver);
	}

}
