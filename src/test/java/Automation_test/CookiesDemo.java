package Automation_test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//how to capture cookies from browser
		Set<Cookie> cookie= driver.manage().getCookies();
		System.out.println("Size of the cookie :- "+ cookie.size());
		
		//how to print cookies from browser
		Cookie ck=new Cookie("MyTestCookie", "Test#123");
		driver.manage().addCookie(ck);
		
		//print the cookie data
		for(Cookie kc:cookie)
		{
			System.out.println(kc.getName()+" : "+ kc.getValue());
		}
		
		 cookie= driver.manage().getCookies();
		System.out.println("Size of the cookie :- "+ cookie.size());
		
		//how to delete specifi cookie object
		//driver.manage().deleteCookie(ck);
		driver.manage().deleteCookieNamed("MyTestCookie");
		cookie= driver.manage().getCookies();
		System.out.println("Size of the cookie :- "+ cookie.size());
		
		//how to delete all cookies
		driver.manage().deleteAllCookies();
		cookie= driver.manage().getCookies();
		System.out.println("Size of the cookie :- "+ cookie.size());
		
		
		
		
	}

}
