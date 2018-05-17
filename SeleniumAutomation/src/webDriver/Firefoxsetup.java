package webDriver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Firefoxsetup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium_Demp//eclipse//e//DRIVERS//geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\eclipse\\e\\DRIVERS\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities = DesiredCapabilities.firefox();
		 capabilities.setBrowserName("firefox");
		 capabilities.setVersion("your firefox version");
		 capabilities.setPlatform(Platform.WINDOWS);
		 capabilities.setCapability("marionette", false);

		 @SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver(capabilities);
	    
	    
	    driver.get("http://apps.qaplanet.in/qahrm/login.php");
	}

}
