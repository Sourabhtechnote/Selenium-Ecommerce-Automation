package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	 @Test
	    public void validLoginTest() {
		 
		 System.out.println("RUNNING: LoginTest - valid");

	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.login("standard_user", "secret_sauce");

	        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Login was not successful");
	    }
	 
	 @Test
	 public void invalidLoginTest() {
		 
		 System.out.println("RUNNING: LoginTest - invalid");

	     LoginPage loginPage = new LoginPage(driver);

	     
	     loginPage.enterUsername("wrong_user");
	     loginPage.enterPassword("wrong_password");
	     loginPage.clickLogin();

	     Assert.assertTrue(
	         loginPage.getErrorMessage().contains("Username and password do not match")
	     );
	 }

}
