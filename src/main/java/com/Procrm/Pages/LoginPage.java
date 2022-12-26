package com.Procrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Procrm.TestBase.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement submit_btn;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void VerifyUserCredentials(String usern,String passw) {
		username.sendKeys(usern);
		password.sendKeys(passw);
	}
	
	public void clickonsubmitBtn() {
		submit_btn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
