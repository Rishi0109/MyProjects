package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass 
{
	public WebDriver driver;
	@FindBy(xpath="//input[contains(@id,'user-name')]")
	private WebElement username;
	@FindBy(xpath="//input[contains(@id,'password')]")
	private WebElement password;
	@FindBy(xpath="//input[contains(@id,'login-button')]")
	private WebElement login;
	
	public LoginPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	public void clickLoginButton()
	{
		login.click();
	}
	
}
