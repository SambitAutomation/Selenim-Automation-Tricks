package Automation_test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_Trick {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//label[text()='Date']")).click();
		
		String year="2021";
		
		String month = "Aug";
		
		String date = "20";
		
		while(true)
		{
			
			String monthyr = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			String arr[]=monthyr.split(" ");
			
			String mon =arr[0];
			String yr = arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			
			else
				driver.findElement(By.xpath("//button[text()='>']")).click();
		}
		
		
		
		List<WebElement> dateData = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		for(WebElement pick:dateData)
		{
			
			String dt=pick.getText();
			if(dt.equals(date))
			{
				pick.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
