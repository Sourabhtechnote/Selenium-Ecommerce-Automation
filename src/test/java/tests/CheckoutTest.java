package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CheckoutTest extends BaseTest {
	
	
	 @Test
	    public void completeCheckoutTest() {
		 
		 System.out.println("RUNNING: CheckoutTest");

	        // Login
	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.login(
	                "standard_user",
	                "secret_sauce"
	        );

	        // Product
	        ProductsPage productsPage =new ProductsPage(driver);

	        productsPage.addBackpackToCart();

	        Assert.assertEquals(productsPage.getCartItemCount(),"1");

	        // Cart
	        productsPage.clickCart();

	        CartPage cartPage = new CartPage(driver);

	        Assert.assertEquals(cartPage.getProductName(),"Sauce Labs Backpack");

	        cartPage.clickCheckout();

	        // Checkout
	        CheckoutPage checkoutPage = new CheckoutPage(driver);

	        checkoutPage.enterCustomerDetails(
	                "Sourabh",
	                "Tester",
	                "400001"
	        );

	        checkoutPage.clickContinue();
	        
	       
	        System.out.println("URL after Continue: " + driver.getCurrentUrl());
	        System.out.println("Page title: " + driver.getTitle());
	 /*     
	        System.out.println("URL after Continue: " + driver.getCurrentUrl());
	        System.out.println("Page title: " + driver.getTitle());
	        
	      Testing purpose added prints.  
	   	 System.out.println(
	                "Page heading: "
	                + checkoutPage.getPageTitle()
	        );

	        System.out.println(
	                "URL: "
	                + driver.getCurrentUrl()
	        );

	        System.out.println(
	                "Finish buttons found: "
	                + driver.findElements(By.id("finish")).size()
	        );
	*/
	        checkoutPage.clickFinish();
	
	        // Verify order
	        Assert.assertEquals(
	                checkoutPage.getConfirmationMessage(),
	                "Thank you for your order!"
	        );
	        
	    }
	
		

}
