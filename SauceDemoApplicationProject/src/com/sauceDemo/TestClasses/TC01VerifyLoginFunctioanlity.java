package com.sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TC01VerifyLoginFunctioanlity extends BaseClass
{
	
	
	@Test
	public void verifyLogin() throws InterruptedException
	{
		
		String actalTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actalTitle, expectedTitle );
		
	
	}
	
	

}
