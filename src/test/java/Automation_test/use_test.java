package Automation_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class use_test {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/poco-c3-arctic-blue-32-gb/p/itm815e140cbd2a0?pid=MOBFVQJ5PMVMSJHT&lid=LSTMOBFVQJ5PMVMSJHTFRB6K5&marketplace=FLIPKART&srno=s_1_1&otracker=search&otracker1=search&fm=SEARCH&iid=5d4472ac-f592-4ba1-83cb-67cef368d788.MOBFVQJ5PMVMSJHT.SEARCH&ppt=sp&ppn=sp&ssid=tq6w5ztlq80000001608807119377&qH=532c28d5412dd75b");
		
		System.out.println(driver.getTitle());

	}

}
