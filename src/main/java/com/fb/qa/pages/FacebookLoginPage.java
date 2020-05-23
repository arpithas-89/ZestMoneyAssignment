package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class FacebookLoginPage extends TestBase {
	
	//Page Factory:
		@FindBy(id="email")
		WebElement emailId;
		
		@FindBy(id="pass")
		WebElement password;
		
		@FindBy(id="loginbutton")
		WebElement loginButton;
		
		//Initializing the Page Objects:
		public FacebookLoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public void facebookLogin(String username, String pwd)
		{
			emailId.sendKeys(username);
			password.sendKeys(pwd);
	        loginButton.click();
	    }
}
