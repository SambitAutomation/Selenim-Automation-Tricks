package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test
	public void loginByEmail()
	{
		System.out.println("Login By Email");
		Assert.assertEquals("Sam","Sam");
	}
	
	@Test
	public void loginByFaceBook()
	{
		System.out.println("Login By FaceBook");
		Assert.assertEquals("Sam","Not");
	}

}
