package com.saucedemo.POMclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{

	WebDriver driver;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement openmenu;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement  Addtocart;
	
	@FindBy(xpath="(//button[text()='Remove'])[1]")	
	private WebElement remove;
	@FindBy(xpath="//span[text()='6']")
	private WebElement cartcontainer;
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	  
	public void AddTocart()
	    {
		Addtocart.click();
	}
	public void Openmenu()
	{
		openmenu.click();
	}
	
	public void Logout()
	{
		logout.click();
	}
	
	public String Addtocart()
	{
		String ADDtext=Addtocart.getText();
	    return ADDtext;
     }
	public String Remove1()
	{
		String remove2=remove.getText();
		return remove2;
	}
}
