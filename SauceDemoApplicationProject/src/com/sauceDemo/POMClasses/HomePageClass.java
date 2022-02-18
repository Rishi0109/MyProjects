package com.sauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageClass 
{
	public WebDriver driver;
	public Actions action;
	@FindBy(xpath="//div//button")
	private List<WebElement>  addtocart;
	@FindBy(xpath="//a[@class='shopping_cart_link']") 
	private WebElement cart;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement hamburger;
	@FindBy(xpath="//a[@id='logout_sidebar_link']") 
	private WebElement logout;
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	
	
	public HomePageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		action=new Actions(driver);
	}
	
	public void clickAddToCart()
	{
		for(int i=2;i<7;i++)
		{
			addtocart.get(i).click();
		}
		
	}
	public void clickCart()
	{
		action.click(cart).perform();
	}
	public void clickHamburgerMenu()
	{
		hamburger.click();
	}
	public void clickLogout()
	{
		logout.click();
	}
	public void clickDropdown()
	{
		dropdown.click();
	}
	public void selectClass()
	{
		Select s=new Select(dropdown);
		s.selectByValue("za");
	}
	public void selectClassLowHi()
	{
		Select s=new Select(dropdown);
		s.selectByValue("lohi");
	}
	public void selectClassHiLow()
	{
		Select s=new Select(dropdown);
		s.selectByValue("hilo");
	}
}
