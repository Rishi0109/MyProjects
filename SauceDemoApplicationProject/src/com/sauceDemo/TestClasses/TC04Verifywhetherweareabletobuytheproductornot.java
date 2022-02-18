package com.sauceDemo.TestClasses;


import java.io.IOException;

import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.CartPageClass;
import com.sauceDemo.POMClasses.CheckOutPage;
import com.sauceDemo.POMClasses.FinalCheckOutPage;
import com.sauceDemo.POMClasses.HomePageClass;

public class TC04Verifywhetherweareabletobuytheproductornot extends BaseClass
{

	
	@Test
	public void buyProduct() throws IOException, InterruptedException
	{
		
		HomePageClass home=new HomePageClass(driver);
		home.clickAddToCart();Thread.sleep(2000);
		home.clickCart();Thread.sleep(2000);
		
		CartPageClass cart=new CartPageClass(driver);
		cart.clickCheckout();Thread.sleep(2000);
		
		CheckOutPage chkout=new CheckOutPage(driver);
		chkout.sendFname();Thread.sleep(2000);
		chkout.sendLname();Thread.sleep(2000);
		chkout.sendZipcode();Thread.sleep(2000);
		chkout.clickContinue();Thread.sleep(2000);
	
		FinalCheckOutPage finish=new FinalCheckOutPage(driver);
		finish.clickFinish();
		
		
	
	}
	
}
