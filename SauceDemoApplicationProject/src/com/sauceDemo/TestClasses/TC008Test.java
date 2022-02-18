package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.CartPageClass;
import com.sauceDemo.POMClasses.CheckOutPage;
import com.sauceDemo.POMClasses.FinalCheckOutPage;
import com.sauceDemo.POMClasses.HomePageClass;
import com.sauceDemo.POMClasses.LoginPageClass;

public class TC008Test 
{
	public static WebDriver driver;
	@BeforeClass
	public void Setup() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is opened");
		driver.get("https://www.saucedemo.com/");
		System.out.println("Website opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeMethod
	public void login1()
	{
		LoginPageClass login=new LoginPageClass(driver);
		login.sendUsername();
		login.sendPassword();login.clickLoginButton();
		System.out.println("Home Page is opened");
		
	}
	@AfterMethod
	public void logout() 
	{
		HomePageClass home=new HomePageClass(driver);
		home.clickHamburgerMenu();home.clickLogout();
		
	}
	@AfterClass
	public void teardown() 
	{
		driver.quit();
	}
	
	@Test
	public void login() throws IOException, InterruptedException
	{
		String actalTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		
		if(expectedTitle.equals(actalTitle))
		{
			System.out.println("Login test is passed");
		}
		
		else
		{
			System.out.println("LoginTest is failed");
		}
		
	}
	@Test
	public void Addtocart() throws IOException, InterruptedException
	{
		
		HomePageClass home=new HomePageClass(BaseClass.driver);
		home.clickAddToCart();
		home.clickCart();
	
		String actalTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		
		if(expectedTitle.equals(actalTitle))
		{
			System.out.println("Add To Cart test is passed");
		}
		
		else
		{
			System.out.println("Add To Cart is failed");
		}
	}
	@Test
	public void buyProduct() throws IOException
	{
		HomePageClass home=new HomePageClass(driver);
		home.clickAddToCart();
		home.clickCart();
	
		
		CartPageClass cart=new CartPageClass(driver);
		cart.clickCheckout();
		
		
		CheckOutPage chkout=new CheckOutPage(driver);
		chkout.sendFname();chkout.sendLname();chkout.sendZipcode();

		chkout.clickContinue();

		
		FinalCheckOutPage finish=new FinalCheckOutPage(driver);
		finish.clickFinish();
		
		String actalTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		
		if(expectedTitle.equals(actalTitle))
		{
			System.out.println("Logout test is passed");
		}
		
		else
		{
			System.out.println("Logout Test is failed");
		}
		
	}
}