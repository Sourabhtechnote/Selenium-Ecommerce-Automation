package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductTest extends BaseTest {
	
	 @Test
	    public void addProductToCartTest() {
		 
		 System.out.println("RUNNING: ProductTest - add product");

	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.login(
	                "standard_user",
	                "secret_sauce"
	        );

	        ProductsPage productsPage = new ProductsPage(driver);
	        
	        productsPage.waitForProductsPage(); 
	        Assert.assertEquals(productsPage.getPageTitle(),"Products");

	       	productsPage.addBackpackToCart();

	        Assert.assertEquals(productsPage.getCartItemCount(),"1");
	    }
	 
	 @Test
	 public void sortProductsTest() {
		 
		 System.out.println("RUNNING: ProductTest - sorting");

		 LoginPage loginPage =
		            new LoginPage(driver);

		    loginPage.login("standard_user","secret_sauce");

		    ProductsPage productsPage = new ProductsPage(driver);

		    productsPage.sortProducts("Price (low to high)" );

		    String firstPrice = productsPage.getFirstProductPrice();

		    System.out.println("First product price: " + firstPrice);

		    Assert.assertEquals(firstPrice,"$7.99");
		}

}
