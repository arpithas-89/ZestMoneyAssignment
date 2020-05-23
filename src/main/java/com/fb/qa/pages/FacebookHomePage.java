package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class FacebookHomePage extends TestBase{
	
	//Page Factory:
	@FindBy(name = "xhpc_message")
    WebElement textBox;
 
    @FindBy (xpath = "//button[contains(.,'Post')]")
    WebElement postButton;
    
    @FindBy (id="userNavigationLabel")
    WebElement navigationLabel;
    
    @FindBy (xpath = "//span[@class='_54nh'][contains(.,'Log Out')]")
    WebElement logOutButton;
    
  //Initializing the Page Objects:
  		public FacebookHomePage()
  		{
  			PageFactory.initElements(driver, this);
  		}
  		
  		//Actions
        public void postStatus(String Status)
        {
    	   textBox.click();
    	   textBox.sendKeys(Status);
           postButton.click();
    }
        
        public void logOutFacebook()
        {
           navigationLabel.click();
           logOutButton.click();
        }
        
}
