package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageClass 
{
	public WebDriver driver;
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	public CartPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickCheckout()
	{
		checkout.click();
	}
}
