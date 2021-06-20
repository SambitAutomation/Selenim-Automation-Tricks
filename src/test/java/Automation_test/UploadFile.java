package Automation_test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://www.monsterindia.com/");
      driver.manage().window().maximize();
      
      driver.findElement(By.xpath("(//a[@title='Click to upload your resume'])[1]")).click();
      
      
      //using sendkeys()
    // driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("E:\\Test.docx");
      
      //using Robot Class menthods
      
      WebElement button= driver.findElement(By.xpath("//input[@id='file-upload']"));
      JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("arguments[0].click();",button);
      
      Robot rb=new Robot();
      rb.delay(2000);
      
      //put the path of the file
      StringSelection ss=new StringSelection("E:\\\\Test.docx");
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
      
      rb.keyPress(KeyEvent.VK_CONTROL);
      rb.keyPress(KeyEvent.VK_V);
      
      rb.keyRelease(KeyEvent.VK_CONTROL);
      rb.keyRelease(KeyEvent.VK_V);
      
      rb.keyPress(KeyEvent.VK_ENTER);
      rb.keyRelease(KeyEvent.VK_ENTER);
      
      
      
      
      

	}

}
