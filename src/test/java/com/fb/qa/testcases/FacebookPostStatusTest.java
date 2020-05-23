package com.fb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.FacebookHomePage;
import com.fb.qa.pages.FacebookLoginPage;

public class FacebookPostStatusTest extends TestBase {
	
	    FacebookLoginPage loginPage;
	    FacebookHomePage homePage;
	    
	    public FacebookPostStatusTest(){
			super();
		}
	    
	    @BeforeMethod
		public void setUp(){
			initialization();
			loginPage = new FacebookLoginPage();
			homePage = new FacebookHomePage();
	    }
	 
	    @Test
	    public void facebookPostStatus() throws InterruptedException{
	   
	    	loginPage.facebookLogin(prop.getProperty("username"), prop.getProperty("password"));
	    	homePage.postStatus("Hello World");
	    	Thread.sleep(5000);
	    	homePage.logOutFacebook();
	    	System.out.println("Logged out Successfully");
	    }
	    
	    @AfterMethod
		public void tearDown(){
			driver.quit();
		}
	        

}
