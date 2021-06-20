package Automation_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownTrick {
	
	static WebDriver driver;
	

	public static void main(String[] args) {


		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		 
		 
		 queryTest(driver, "choice 2 1");
		

	}

	public static void queryTest(WebDriver driver, String... value)
	{
		List<WebElement> checkBox= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement itemBox:checkBox)
			{
				String text=itemBox.getText();
				
				for(String val:value)
				{
					if(text.equals(val))
					{
						itemBox.click();
						break;
					}
				}
			}
		}
		
		else {
			for(WebElement check:checkBox)
			{
				check.click();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
