package Automation_test;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link_broken_OR_Valid_Trick {
	
	public static void main(String[] args) throws Exception {
		
		int brokenLink = 0;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			
			if(url == null || url.isEmpty())
			{
				System.out.println("Url is empty");
				continue;
			}
			
			URL weblink=new URL(url);
			try
			{
			HttpURLConnection connection=(HttpURLConnection)weblink.openConnection();
			connection.connect();
			  
			    if(connection.getResponseCode()>=400)
			    {
			    	System.out.println(connection.getResponseCode()+url+"  is "+"  borken Link");
			    	brokenLink++;
			    }
			    
			    else
			    {
			    	System.out.println(connection.getResponseCode()+url+"  is  "+" valid link");
			    }
			}
			catch(Exception e) {}
		}
		
		System.out.println("total broken link count : "+ brokenLink);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
