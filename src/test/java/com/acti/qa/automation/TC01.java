package com.acti.qa.automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import acti.base.DriverScript;
import acti.page.LoginPage;

public class TC01 extends DriverScript {
 
	LoginPage lp;
	public TC01()
	{
		//super keyword is used to call the base class constructor
		super();
	}
	
	@BeforeMethod
	
	public void preTest()
	{
		initBrowser();
		 lp = new LoginPage();
	}
	@AfterMethod
	
	public void postTest()
	{
		driver.close();
	}
	
	
	@Test (priority=1)
	public void VerifyLoginTitle()
	{
		
		 Object res = lp.VerifyTitle();
		 System.out.println(res);
	}
	
	@Test(priority=2)
	public void VerifyLogo()
	{
		Object Logo = lp.VerifyLogoIsDisplayed();
		System.out.println(Logo);
	}
	
	@Test(priority=3)
	public void VerifyLoginFunction()
	{
		lp.VerifyLoginFunction("admin", "manager");
	}
	
	
	
	
	
	
	
	
}
