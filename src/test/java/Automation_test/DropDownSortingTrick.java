package Automation_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSortingTrick {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		
		WebElement dropDownList= driver.findElement(By.name("category_id"));
		
		Select data=new Select(dropDownList);
		
		List<WebElement> allOptions= data.getOptions();
		
		ArrayList originalList=new ArrayList();	
		ArrayList templList=new ArrayList();	
		
		for(WebElement option:allOptions)
		{
			originalList.add(option.getText());
			templList.add(option.getText());
		}
		
		System.out.println("Before sorting Original List :- "+ originalList);
		System.out.println("Before sorting temporary List :- "+ templList);
		
		Collections.sort(templList);
		
		System.out.println("After sorting Original List :- "+ originalList);
		System.out.println("After sorting temporary List :- "+ templList);
		
		if(originalList.equals(templList))
		{
			System.out.println("It's sorted");
		}
		
		else
			System.out.println("It's not sorted");

		
		
		
		
		
	}

}
