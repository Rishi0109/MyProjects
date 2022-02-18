package com.sauceDemo.TestClasses;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TC03VerifyLogoutFunctionality extends BaseClass
{
	
	
	@Test
	public void verifyLogOut() throws InterruptedException, IOException
	{
			
		String actalTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		
		Assert.assertEquals(actalTitle, expectedTitle);
	}

}
