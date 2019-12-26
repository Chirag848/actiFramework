package acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.base.DriverScript;

public class TaskList extends DriverScript{

	//**************************** Object Identification****************************************//
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement AddnewBtn;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement NewCustBtn;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")WebElement EnterCustNmTb;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement DescriptionTb;
	@FindBy(xpath="//div[contains(text(),'  Create Customer')]") WebElement CreatCustTb;
	
	
	
	//**************************** Page / Object Initialization****************************************//
	
	
	public TaskList()
	{
		PageFactory.initElements(driver, this);
	}
	
	//***************************Action/Method******************************************************************//
	
	public void ClickAddNewCustomer()
	{
		AddnewBtn.click();
	}
	
	public void ClickNewCustNM()
	{
		NewCustBtn.click();
	}
	public void AddCustNM(String CustFNM, String CustLNM)
	{
		EnterCustNmTb.sendKeys(CustFNM);
		DescriptionTb.sendKeys(CustLNM);
	}
	
	
	public void ClickCreatCust()
	{
		CreatCustTb.click();
	}
	
	
}
