package Automation_test;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadPDFFileToDesiredLocation {

	
public static void main(String[] args) {
		
		String location=System.getProperty("user.dir")+"\\DownloadFiles";
		
		//chrome
//		
//		HashMap preference= new HashMap();
//		preference.put("plugins.always_open_pdf_externally", true); //for pdf download
//        preference.put("download.default_directory",location);
//        
//        ChromeOptions options=new ChromeOptions();
//        options.setExperimentalOption("prefs",preference);
//        
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver(options);
//        
        //Edge
		
//		HashMap preference= new HashMap();
//        preference.put("plugins.always_open_pdf_externally", true); //for pdf download
//        preference.put("download.default_directory",location);
//        
//        EdgeOptions options=new EdgeOptions();
//        options.setExperimentalOption("prefs",preference);
//        
//        WebDriverManager.edgedriver().setup();
//        WebDriver driver=new EdgeDriver(options);
//        
		
		//FireFox
		
		FirefoxProfile profile=new FirefoxProfile();
	    profile.setPreference("pdfjs.disabled",true);  //For only pdf
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf"); //mime type
		profile.setPreference("browser.download.folderList",2); // 0- desktop  1- download  2- desired Location
		profile.setPreference("browser.download.dir",location);
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver(options);
        
        
        
        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("(//a[text()='Download sample pdf file'])[1]")).click();
       
        
        
        
        
}
}
