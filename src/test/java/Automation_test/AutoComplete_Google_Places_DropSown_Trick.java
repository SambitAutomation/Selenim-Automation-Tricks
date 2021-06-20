package Automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete_Google_Places_DropSown_Trick {

	public static void main(String[] args)throws Exception {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		
		searchBox.clear();
		Thread.sleep(2000);
		
		searchBox.sendKeys("Toronto");
		Thread.sleep(2000);
		
		String text;
		
		
		do
		{
			searchBox.sendKeys(Keys.ARROW_DOWN);
			
			Thread.sleep(2000);
			
			text=searchBox.getAttribute("value");
			
			if(text.equals("Toronto Premium Outlets, Steeles Avenue West, Toronto, ON, Canada"))
			{
				searchBox.sendKeys(Keys.ENTER);
				break;
			}
			
		}while(!text.isEmpty());
		
		
		

	}

}
