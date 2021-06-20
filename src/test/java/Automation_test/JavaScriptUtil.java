package Automation_test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	public static void drawBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
	
	public static String getTitleBYJS(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title= js.executeScript("return document.titile;").toString();
		return title;
	}
	
	public static void cickElementByJS(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	
	public static void alertwindow(WebDriver driver, String message)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('" + message + "')");
	}
	

	public static void refreshBrowser(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void scrollPageUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}
	
	public static void zoomPageByJS(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");
	}
	
	public static void flash(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String bgColor=element.getCssValue("backgroungColor");
		
		for(int i=0;i< 50; i++)
		{
			changeColor("#000000", element, driver);
			changeColor(bgColor, element, driver);
		}
	}
	
	
	public static void changeColor(String color, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'",element);
		
		try
		{
			Thread.sleep(20);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

}
