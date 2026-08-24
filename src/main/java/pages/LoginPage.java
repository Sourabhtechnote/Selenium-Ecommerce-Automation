package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;

    // Locators
    private By usernameField = By.id("user-name");
    
    private By passwordField = By.id("password");

    private By loginButton = By.id("login-button");

    private By errorMessage = By.cssSelector("[data-test='error']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
    	
        driver.findElement(usernameField).sendKeys(username);
        
    }
    
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
    	
    	
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.urlContains("inventory.html"));
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

}
