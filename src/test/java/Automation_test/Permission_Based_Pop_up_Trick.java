package Automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Permission_Based_Pop_up_Trick {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver(options);
			
			driver.manage().window().maximize();
			
			driver.get("https://www.redbus.in/");
	}

}
