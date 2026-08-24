package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
	
	 WebDriver driver;

	    By pageTitle = By.className("title");

	    By sortDropdown = By.className("product_sort_container");

	    By backpack = By.id("add-to-cart-sauce-labs-backpack");

	    By cartIcon = By.className("shopping_cart_link");

	    By cartBadge = By.className("shopping_cart_badge");

	    public ProductsPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public String getPageTitle() {
	        return driver.findElement(pageTitle).getText();
	    }

	    public void sortProducts(String option) {

	        Select select = new Select(driver.findElement(sortDropdown));

	        select.selectByVisibleText(option);
	    }

	    public void addBackpackToCart() {
	        driver.findElement(backpack).click();
	    }

	    public String getCartItemCount() {
	        return driver.findElement(cartBadge).getText();
	    }

	    public void clickCart() {
	        driver.findElement(cartIcon).click();
	    }
	    
	    By firstProductPrice = By.className("inventory_item_price");
	    public String getFirstProductPrice() {
	        return driver.findElements(firstProductPrice).get(0).getText();
	    }
	    
			    public void waitForProductsPage() {		
			        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			        wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle));
			    }

}
