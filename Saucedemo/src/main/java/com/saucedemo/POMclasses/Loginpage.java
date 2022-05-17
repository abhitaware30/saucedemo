package com.saucedemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Loginpage {
	
	public WebDriver driver;
	
   @FindBy(xpath="//input[@id='user-name']")
   WebElement username;
  
   @FindBy(xpath="//input[@id='password']")
   WebElement password;
   
   @FindBy(xpath="//input[@id='login-button']")
   WebElement login;
   
   public Loginpage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void Username()
   {
	   username.sendKeys("standard_user");
   }
   
   public void Password()
   {
	   password.sendKeys("secret_sauce");
   }
   
   public void Login()
   {
	   login.click();
   }
   
   
   
   
   
   
   
}

