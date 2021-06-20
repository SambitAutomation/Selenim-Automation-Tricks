package Automation_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_test {

	@Test(dataProvider ="getdata")
	public void passingdata(String uname, String pwd)
	{
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	@DataProvider(name = "getdata")
	public String[][] getsdata()
	{
		String[][] data= {{"sambit","1234"}, {"samss", "09876"}};
		return data;
	}
	
	
}
