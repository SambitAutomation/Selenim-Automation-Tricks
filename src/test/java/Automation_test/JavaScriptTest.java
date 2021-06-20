package Automation_test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptTest {

	public static void main(String[] args)throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--incognito");
		
		ChromeDriver driver=new ChromeDriver(options.addArguments("--incognito"));
		
		
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.location='https://www.selenium.dev/'");
		
          Thread.sleep(5000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
	}

}
