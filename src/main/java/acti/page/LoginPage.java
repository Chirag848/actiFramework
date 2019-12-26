package acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.base.DriverScript;

public class LoginPage extends DriverScript{

	//Created By CHIRAG//
	
	//*****************************Object identification *************************************//
	
	@FindBy(id="username")WebElement usernametb;
	@FindBy(name="username")WebElement PasswordTb;
	@FindBy(id="loginButton")WebElement LoginBtn;
	@FindBy(xpath="//Div[@class='atLogoImg']")WebElement actitimelogo;
	@FindBy(id="loginRecoveryLinkContainer")WebElement ForgotPswLink;
	
	
	//*****************************Page/ Object initialization *************************************//
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//************************************Action******************************************************//
	
		public String VerifyTitle()
		{
			return driver.getTitle();
			
		}
		
		public boolean VerifyLogoIsDisplayed()
		{
			return actitimelogo.isDisplayed();
		}
	
		public void VerifyLoginFunction(String username, String password)
		{
			usernametb.sendKeys(username);
			PasswordTb.sendKeys(password);
			LoginBtn.click();
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

