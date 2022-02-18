package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePageClass;

public class TC07Verifywhetherweareabletoapplythefilter extends BaseClass
{
	
	
	@Test
	public void applyFilter() throws IOException, InterruptedException
	{
		home=new HomePageClass(driver);
		home.clickDropdown();Thread.sleep(2000);
		home.selectClass();
//		screenshot();
		
		home.clickDropdown();Thread.sleep(2000);
		home.selectClassHiLow();
//		screenshot();
		
		home.clickDropdown();Thread.sleep(2000);
		home.selectClassLowHi();
//		screenshot();		
		
	}
	
}
