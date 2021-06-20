package Automation_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class User_Authentication_Pop_UP_Trick {
	
	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Syntax for passing user authentication value
		
		//driver.get("userName:password@URL");
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
