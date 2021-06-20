package Automation_test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotTaking {

	public static void main(String[] args)throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Takes screenshot for Particular Page
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".\\ScreenShotStore\\FullHomePageSCreen.png");
//		org.apache.commons.io.FileUtils.copyFile(src, trg);
//		
		
		//Takes Screenshot for some specified Portion
//		WebElement spPortion=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		File src=spPortion.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".\\ScreenShotStore\\FeaturedProductSCreen.png");
//		org.apache.commons.io.FileUtils.copyFile(src, trg);
//		
		//Takes Screenshot for particular Portion
		WebElement singlePart=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src=singlePart.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\ScreenShotStore\\Logo.png");
		org.apache.commons.io.FileUtils.copyFile(src, trg);
		
		driver.quit();
		
		
		
	}

}
