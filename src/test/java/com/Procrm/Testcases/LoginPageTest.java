package com.Procrm.Testcases;

import org.testng.annotations.Test;

import com.Procrm.Pages.LoginPage;
import com.Procrm.TestBase.BaseClass;

public class LoginPageTest extends BaseClass{
	
	LoginPage loginpage;
	@Test
	public void verifyUserCredentialTest() {
		
		 loginpage=new LoginPage();
		 loginpage.VerifyUserCredentials("Girigowda","Girigowda@1197");
		 loginpage.clickonsubmitBtn();
		 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
