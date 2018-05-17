package webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class EmpInfo {
	
	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver", "D://Selenium_Demp//eclipse//e//DRIVERS//geckodriver.exe");
        WebDriver Driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP35\\Downloads\\e\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//to open the application
        driver.get("http://apps.qaplanet.in/qahrm/login.php"); 
        driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");//Input to Login Name
     	driver.findElement(By.name("txtPassword")).sendKeys("lab1");//Input to Login Name
     	driver.findElement(By.name("Submit")).click();
     	
     	/*Frame selection*/
        driver.switchTo().frame("rightMenu"); 
        String stext = driver.findElement(By.xpath("//*[@id='standardView']/div[1]/h2")).getText();
        System.out.println(stext);
//		Collect displayed table information
        
        try {
            List<WebElement> no = driver.findElements(By.tagName("a"));
            int nooflinks = no.size(); 
            System.out.println(nooflinks);
            for (WebElement pagelink : no)
                 {
                  String linktext = pagelink.getText();
                  System.out.println(linktext+" ->");
                  }
            
            List <WebElement> col = driver.findElements(By.xpath(".//*[@id='standardView']/table/thead/tr"));
            System.out.println("No of columns are : " +col.size());
            for (WebElement webElement : col) {
                System.out.println(webElement.getText());
            }
            
            List <WebElement> row = driver.findElements(By.xpath("//*[@id='standardView']/table/tbody/tr"));
            System.out.println("No of rows are : " +row.size());
            for (WebElement webElement : row)
            {
            	System.out.println(webElement.getText());
            }
            
           }
        catch (Exception e){
                     System.out.println("error "+e);
                 }
        
        
	}

}
