package webDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WorkingWithAlerts {
	public static void main(String[] args) throws Exception  {
		/*System.setProperty("webdriver.gecko.driver", "D://Selenium_Demp//eclipse//e//DRIVERS//geckodriver.exe");
        WebDriver Driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\eclipse\\e\\DRIVERS\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(Driver, 10);
		//-------------------------------------------------------
	//Open application
			Driver.get("http://apps.qaplanet.in/WebApp/");
			
			String parent=Driver.getWindowHandle();
			System.out.println(parent);
			
			//wait for home page
			wait.until(ExpectedConditions.titleIs("New Document"));
			String j = Driver.getTitle();
			System.out.println("your page title is :"+j);
			if(j.equals("New Document")){
				System.out.println("your page opened");
			}	
	//2nd title	
	
		Driver.findElement(By.xpath("/html/body/div/h1[1]/a")).click();

		Set<String> windows=Driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator<String> wind=windows.iterator();
		while (wind.hasNext()) 
		{
			String chailed = (String) wind.next();
			if(!parent.equalsIgnoreCase(chailed))
			{
				Driver.switchTo().window(chailed);
			}
		
		wait.until(ExpectedConditions.titleIs("Age Problem"));
		String k=Driver.getTitle();
		System.out.println("your page title is :"+k);
		
		if(k.equals(" Age Problem ")){
			System.out.println("your page opened");}
			
		
		//Enter age
		Driver.findElement(By.name("txtAge")).sendKeys("10");
		//Click on submit
		Driver.findElement(By.id("idSubGo")).click();
		//wait for alert
		wait.until(ExpectedConditions.alertIsPresent());
		//Switch to alert
		Alert A=Driver.switchTo().alert();
		if(A.getText().equals("Kid")){
			System.out.println("Kid alert displayed");}
			A.accept();
			Driver.close();
			
		}
		//---------------------------------------
		

	}
}
