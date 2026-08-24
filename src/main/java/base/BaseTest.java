package base;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;

    @BeforeMethod
    public void setUp() {
    	
    	System.out.println("===== STARTING TEST =====");
    	
    	ChromeOptions options = new ChromeOptions();
    	
    	options.addArguments("--disable-features=PasswordLeakDetection");

    	options.setExperimentalOption("prefs", Map.of(
                "credentials_enable_service", false,
                "profile.password_manager_enabled", false,
                "profile.password_manager_leak_detection", false
        ));

    	driver = new ChromeDriver(options);

     //  driver = new ChromeDriver();
        
     //   Thread.sleep(2000);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.saucedemo.com/");
        
    //    Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
    	
    	  System.out.println("===== CLOSING BROWSER =====");
    	
    //	 Thread.sleep(2000);
    	 driver.quit();
    }

}
