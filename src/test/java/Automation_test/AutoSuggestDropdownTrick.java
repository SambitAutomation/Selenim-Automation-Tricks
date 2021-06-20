package Automation_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdownTrick {

	public static void main(String[] args) throws Exception {
		
          WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("software");
		Thread.sleep(3000);
		
		List<WebElement> list= driver.findElements(By.xpath("//li[@role='presentation']//div[@class='sbl1']//span"));
		
		for(WebElement optionList:list)
		{
			if(optionList.getText().contains("developer"))
			{
				optionList.click();
				break;
			}
		}

	}

}
