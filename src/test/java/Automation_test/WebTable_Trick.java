package Automation_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Trick {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		//For counting Number of rows
		
		List<WebElement> rows =  driver.findElements(By.xpath("//table[@class='data-list']//tr"));
         
		 int row = rows.size();
		  System.out.println("Total number of Rows in Table : "+ row);
		  
		  //For counting Number Of Columns
		  
		  List<WebElement> columns =  driver.findElements(By.xpath("//table[@class='data-list']//th"));
	         
			 int col = columns.size();
			  System.out.println("Total number of Columns in Table : "+ col);
			  
			
		//Getting all the data from table
//			  
//			  for(int r=1;r<row;r++)
//			  {
//				  for(int c=1;c<=col;c++)
//				  {
//					  System.out.println(driver.findElement(By.xpath("//table[@class='data-list']//tr["+r+"]//td["+c+"]")).getText()+"    ");
//				  }
//				  System.out.println();
//			  }
//		
			 
	
			  
			  //Specific Data from Table with Related points
		  
			  for(int r=1;r<row;r++)
			  {
				  String LanguagwData = driver.findElement(By.xpath("//table[@class='data-list']//tbody//tr["+r+"]//td[1]")).getText();
				  
				  if(LanguagwData.equals("Java"))
				  {
					  String versionData = driver.findElement(By.xpath("//table[@class='data-list']//tbody//tr["+r+"]//td[2]")).getText();
					  String ReleaseDate = driver.findElement(By.xpath("//table[@class='data-list']//tbody//tr["+r+"]//td[3]")).getText();
					  
					  System.out.println(LanguagwData+" "+versionData+"    "+ReleaseDate);
				  }
			  }
			  
			  
			  driver.quit();
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
	}

}
