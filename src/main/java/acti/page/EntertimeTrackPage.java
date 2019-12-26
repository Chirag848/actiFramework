package acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.base.DriverScript;

public class EntertimeTrackPage extends DriverScript {

	//******************** Object Identification***************************************//
	
	@FindBy(id="logoutLink") WebElement Longoutlink;
	@FindBy(xpath="//div[@class='secondLevelNavigationItem preventPanelsHiding selected ']") WebElement TimetrackLink;
	@FindBy(xpath="//div[@id='container_tasks']") WebElement Tasksmenu;
	
	
	//******************** Page/ Object Repository***************************************//
	
	public EntertimeTrackPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//***********************Action / Method*************************************************//
	
	public void LogoutFunction()
	{
		Longoutlink.click();
	}
	
	public void clickTaskMenu()
	{
		Tasksmenu.click();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
