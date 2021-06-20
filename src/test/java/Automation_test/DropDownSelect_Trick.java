package Automation_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelect_Trick {
	
     static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		WebElement noOfEmp = driver.findElement(By.xpath("//select[@name='NoOfEmployees']"));
		testDropDown(noOfEmp, "76 - 100");
		
		WebElement industry = driver.findElement(By.xpath("//select[@name='Industry']"));
		testDropDown(industry, "Travel");
		
		WebElement country = driver.findElement(By.xpath("//select[@name='Country']"));
		testDropDown(country, "Algeria");
		
		
	}

	public static void testDropDown(WebElement emp, String value)
	{
		Select check= new Select(emp);
		
		List<WebElement> allOptions= check.getOptions();
		
		for(WebElement Option:allOptions)
		{
			if(Option.getText().equals(value))
			{
				Option.click();
				break;
			}
			
		}
	}
	
	
}
