package com.sauceDemo.TestClasses;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePageClass;


public class TC02VerifyAddToCartFUnctionality extends BaseClass
{
	
	@Test
	public void VerifyAddToCart() throws IOException, InterruptedException
	{
		HomePageClass home=new HomePageClass(driver);
		home.clickAddToCart();Thread.sleep(2000);
		home.clickCart();Thread.sleep(2000);
	
		String actalTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actalTitle, expectedTitle);
	}
	

}
