package com.saucedemo.Testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMclasses.Homepage;
import com.saucedemo.POMclasses.Loginpage;

public class BaseClass 
{
	public WebDriver driver;
	@Parameters("browsername")
	
	@BeforeClass
	public void openbrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver =new ChromeDriver();
		}
		else  if(browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver =new FirefoxDriver();
		}
		else
		{
			System.out.println("error");
		}
	}
	@BeforeMethod
	public void loginaccount()
	
	{
		
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		
        driver.get("https://www.saucedemo.com/");
        
		Loginpage ln = new Loginpage(driver);
		ln.Username();
		ln.Password();
		ln.Login();
	}

	@AfterMethod
	public void logoutaccount()
	{
		Homepage hp =new Homepage(driver);
		hp.Openmenu();
		hp.Logout();
	}
	
	@AfterClass
	public void teardown()
	{
		
		driver.quit();
	}
	
	
}

