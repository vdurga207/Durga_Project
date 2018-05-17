package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginValidation{
	static String actualTitle;
	public static void main(String[] args) {
		/*DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities = DesiredCapabilities.firefox();
		 capabilities.setBrowserName("firefox");
		 capabilities.setVersion("your firefox version");
		 capabilities.setPlatform(Platform.WINDOWS);
		 capabilities.setCapability("marionette", false);

		 @SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver(capabilities);*/
		/*System.setProperty("webdriver.gecko.driver", "D://Selenium_Demp//eclipse//e//DRIVERS//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP35\\Downloads\\e\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://apps.qaplanet.in/qahrm/login.php"); //to open the browser
        
        //--------Home----Page---------//
        //using wait 
        WebDriverWait wait=new WebDriverWait(driver,60);
      	// verify Home page
        actualTitle = driver.getTitle();
        System.out.println("Title of page is "+actualTitle);
     		if(wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management")))
     		{
     			System.out.println("Orange HRM page is displayed");
     		}
     		else
     		{
     			System.out.println("Failed to display orange HRM");
     			return;
     		}
     	// Create WebElement for User,password, login and submit
    		WebElement UName=driver.findElement(By.name("txtUserName"));
    		WebElement PWD=driver.findElement(By.name("txtPassword"));
    		WebElement objLogin=driver.findElement(By.name("Submit"));
    		WebElement objClear=driver.findElement(By.name("clear"));
    		// verify username and password
    		if(UName.isDisplayed() && PWD.isDisplayed())
    		{
    			System.out.println("Username and password fields are dislpayed");
    		}
    		else
    		{
    			System.out.println("Failed to display username and password fields");
    		}
    		//verify Login and clear
    		if(objLogin.isDisplayed() && objClear.isDisplayed())
    		{
    			System.out.println("Login and clear buttons are displayed");
    		}
    		else
    		{
    			System.out.println("Failed to display Login and clear buttons");
    		}
    		String sUN="qaplanet1";
    		String sPWD="lab1";
    		UName.sendKeys(sUN);
    		PWD.sendKeys(sPWD);
    		objLogin.click();
    		//--------After---login---Page---------//
    		// verify whether use name is displayed
    		String welcome=driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText();
    		if(welcome.equals("Welcome"+sUN))
    		{
    			System.out.println("Welcome"+sUN+"is displayed");
    		}
    		
    		WebElement objLog=driver.findElement(By.linkText("Logout"));
    		if(objLog.isDisplayed()){
    			System.out.println("Logout link is present");
    		}
    		else{
    			System.out.println("Logout link was absent");
    		}
    		objLog.click();
    		System.out.println("Logout from the application successfully");
	}

}
