package Automation_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronisation_Explicit_Wait_Trick {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		By eleLocator=By.xpath("//h3[text()='Selenium WebDriver']");
		
		WebElement ele=waitUntillGettingWebelement(driver, eleLocator, 10);
		
		ele.click();

	}
	
	public static WebElement waitUntillGettingWebelement(WebDriver driver, By locator, int timeunit)
	{
		WebDriverWait waitTIme= new WebDriverWait(driver, Duration.ofSeconds(timeunit));
		
		waitTIme.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
		return driver.findElement(locator);
		
		
	}

}
