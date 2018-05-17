package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeeRecords {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\eclipse\\e\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php"); //to open the browser
	       
        /*LoginValidation*/
        driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");//Input to Login Name
        driver.findElement(By.name("txtPassword")).sendKeys("lab1");//Input to Login Name
        driver.findElement(By.name("Submit")).click();
	}

}
