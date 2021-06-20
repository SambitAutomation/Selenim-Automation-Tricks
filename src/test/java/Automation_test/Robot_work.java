package Automation_test;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_work {
	
	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Software\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		TakesScreenshot s=(TakesScreenshot)driver;
		File src=s.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(src,new File("D://test.jpg"));
		driver.findElement(By.xpath("//label[@id='wdgt-file-upload']")).click();
		Thread.sleep(3000);
		StringSelection selection=new StringSelection("D:\\aim.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
