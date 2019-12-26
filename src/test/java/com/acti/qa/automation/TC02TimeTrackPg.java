package com.acti.qa.automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import acti.base.DriverScript;
import acti.page.EntertimeTrackPage;
import acti.page.LoginPage;
import acti.page.TaskList;

public class TC02TimeTrackPg extends DriverScript {
	LoginPage lp; 
	TaskList tl;
	EntertimeTrackPage tp;
	
	public TC02TimeTrackPg(){
		super();
	}
	
	@BeforeMethod
	public void preTest()
	{
		initBrowser();
		lp= new LoginPage();
		tl = new TaskList();
		tp = new EntertimeTrackPage();
		 
	}
	@AfterMethod
	public void postTest()
	{
		driver.close();
	}
	
	
	@Test (priority=1)
	public void verifyLoginPage()
	{
		
		lp.VerifyLoginFunction("admin", "manager");
		tp.clickTaskMenu();
		/*tl.ClickAddNewCustomer();
		tl.ClickNewCustNM();
		tl.AddCustNM("Test", "Test");
		tl.ClickCreatCust();
		tp.LogoutFunction();*/
	}
	
	
	/*@Test(priority=2)
	public void ClickTimeTrack()
	{
		tp.clickTaskMenu();
	}
	
	@Test (priority=3)
	public void ClickAddCust()
	{
		tl.ClickAddNewCustomer();
	}
	
	@Test (priority=4)
	public void ClickNewCust()
	{
		tl.ClickNewCustNM();
	}
	
	@Test (priority=5)
	public void EnterCustNm()
	{
		tl.AddCustNM("Test", "Test");
	}
	
	@Test (priority=6)
	public void CreateCust()
	{
		tl.ClickCreatCust();
	}
	
	@Test (priority=7)
	public void Logout()
	{
		tp.LogoutFunction();
	}*/
	
	
}
