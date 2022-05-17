package com.saucedemo.Testclasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMclasses.Homepage;

public class TC01loginfunctionality extends BaseClass
{

@Test()
public void loginfunctionality()
   {
	String actualurl=driver.getCurrentUrl();
	System.out.println(actualurl);
    String Expectedurl ="https://www.saucedemo.com/inventory.html";
    System.out.println(Expectedurl);
    Assert.assertEquals(actualurl, Expectedurl, "failed");
    }
@Test(priority=1)
public void AddtoCartfunctionality()
{
	Homepage home = new Homepage(driver);

	
	
	home.AddTocart();
	
	String actualtext=home.Remove1();
	System.out.println(actualtext);
	String Expectedtext="REMOVE";
	System.out.println(Expectedtext);
	Assert.assertEquals(actualtext, Expectedtext);
	
}
	
}
