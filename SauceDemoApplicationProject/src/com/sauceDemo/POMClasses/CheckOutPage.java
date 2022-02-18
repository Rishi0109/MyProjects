package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage
{
	public WebDriver driver;
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement zipcode;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuee;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendFname()
	{
		firstname.sendKeys("Rishikesh");
	}
	public void sendLname()
	{
		lastname.sendKeys("Pal");
	}
	public void sendZipcode()
	{
		zipcode.sendKeys("441904");
	}
	public void clickContinue()
	{
		continuee.click();
	}
}
