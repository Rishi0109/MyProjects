package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalCheckOutPage 
{
	public WebDriver driver;
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;
	
	public FinalCheckOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFinish()
	{
		finish.click();
	}
	
	
	
}
