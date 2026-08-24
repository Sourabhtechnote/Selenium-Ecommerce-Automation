package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

	WebDriver driver;

		By firstName = By.id("first-name");
		
		By lastName = By.id("last-name");
		
		By postalCode = By.id("postal-code");
		
		By continueButton = By.id("continue");
		
		By finishButton = By.id("finish");
		
		By confirmationMessage = By.className("complete-header");
		
	//	By pageTitle = By.className("title");
	//	public String getPageTitle() {
	//	    return driver.findElement(pageTitle).getText();
	//	}
		
		public CheckoutPage(WebDriver driver) {
		    this.driver = driver;
		}
		
		public void enterCustomerDetails(
		        String firstName,
		        String lastName,
		        String postalCode) {
		
		    driver.findElement(this.firstName).sendKeys(firstName);
		
		    driver.findElement(this.lastName).sendKeys(lastName);
		
		    driver.findElement(this.postalCode).sendKeys(postalCode);
		}
		
		public void clickContinue() {
			WebDriverWait wait =
		            new WebDriverWait(driver, Duration.ofSeconds(10));

		    wait.until(
		            ExpectedConditions.elementToBeClickable(continueButton)
		    ).click();

		    
		}
		
		public void clickFinish() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    wait.until(ExpectedConditions.elementToBeClickable(finishButton));

		    driver.findElement(finishButton).click();
		
		}
		
		public String getConfirmationMessage() {
			WebDriverWait wait =
		            new WebDriverWait(
		                    driver,
		                    Duration.ofSeconds(10)
		            );

		    return wait.until(
		            ExpectedConditions.visibilityOfElementLocated(confirmationMessage)).getText();
		}
		
		
		public void waitForOverviewPage() {
			
			WebDriverWait wait =
		            new WebDriverWait(driver, Duration.ofSeconds(10));

		    wait.until(
		            ExpectedConditions.urlContains(
		                    "checkout-step-two.html"
		            )
		    );
			
		}

}
