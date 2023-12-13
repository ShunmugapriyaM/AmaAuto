package qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import qa.utils.Constants;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void launchApp(String browser) {
		launchBrowser(browser);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(Constants.url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = WebDriverManager.chromedriver().create();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = WebDriverManager.edgedriver().create();
		}else {
			System.out.println("No browser is defined in xml file");
		}
	}

}

