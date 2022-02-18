package com.sauceDemo.TestClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.sauceDemo.POMClasses.HomePageClass;
import com.sauceDemo.POMClasses.LoginPageClass;

public class BaseClass 
{
	public static WebDriver driver;
	public LoginPageClass login;
	public HomePageClass home;
	public static void screenshot() throws IOException
	{
		DateFormat dt=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		Date d=new Date();
		String time=dt.format(d);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String ext=".png";
		File dest=new File("G:\\ScreenShot\\Sauce\\POM\\TC001\\ScreenShot-- "+time+ext);
		FileHandler.copy(source, dest);
	}
	@BeforeTest
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
	public void login() throws IOException
	{
		login=new LoginPageClass(driver);
		login.sendUsername();
		login.sendPassword();login.clickLoginButton();
		System.out.println("Home Page is opened");
		
	}
	@AfterMethod
	public void logout() throws InterruptedException, IOException
	{
		home=new HomePageClass(driver);
		home.clickHamburgerMenu();home.clickLogout();
		
	}
	@AfterTest
	public void teardown() throws InterruptedException
	{
		driver.quit();
	}
	
}
