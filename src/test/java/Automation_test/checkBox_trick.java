package Automation_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBox_trick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
//		//click on specific checkBox
//		
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
//		
		//click on all check Boxes
	
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//div//label//input[@type='checkbox']"));
//		
//		for(WebElement chkbx:checkBoxes)
//		{
//			chkbx.click();
//		}
//	
	
//		//click on speific checkbox according to our requirement
//		
//		for(WebElement chkbx:checkBoxes)
//		{
//			if(chkbx.getAttribute("id").equalsIgnoreCase("Monday") || chkbx.getAttribute("id").equalsIgnoreCase("sunday" ))
//					{
//				              chkbx.click();
//					}
//		}
//	
	
	   //click on last 2 checkBoxes
		
		int totalCheckBox = checkBoxes.size();
		
//		for(int i=totalCheckBox-2;i<totalCheckBox;i++)
//		{
//			checkBoxes.get(i).click();
//		}
//		
		//click on first 2 checkBoxes
		
				for(int i=0;i<totalCheckBox;i++)
				{
					if(i<2)
					{
						checkBoxes.get(i).click();
					}
				}
	
	
	
	
	}
}
