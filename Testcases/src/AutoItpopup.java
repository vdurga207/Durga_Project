import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoItpopup {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		WebDriverWait Wait=new WebDriverWait(Driver,60);
		Actions Act=new Actions(Driver);
		
		//Testcase-1
		
		//To open Webpage
		Driver.get("http://apps.qaplanet.in/qahrm/login.php");
		
		//To verify webpage
		if(Wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management")))
		{
			System.out.println("Loginpage is displayed");
		}
		else
		{
			System.out.println("Loginpage not displayed");
		}
		
		WebElement UN=Wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
		WebElement PWD=Wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
		WebElement LIN=Wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
		WebElement CLR=Wait.until(ExpectedConditions.presenceOfElementLocated(By.name("clear")));
		if(UN.isDisplayed())
		{
			System.out.println("Username field is displayed");
		}
		if(PWD.isDisplayed())
		{
			System.out.println("Password field is displayed");
		}
		if(LIN.isDisplayed())
		{
			System.out.println("Login Button is displayed");
		}
		if(CLR.isDisplayed())
		{
			System.out.println("Clear Button is displayed");
		}
		
		String SUN="qaplanet1";
		String SPWD="lab1";
		
		UN.clear();
		UN.sendKeys(SUN);
		PWD.clear();
		PWD.sendKeys(SPWD);
		LIN.click();
		
		if(Wait.until(ExpectedConditions.titleIs("OrangeHRM")))
		{
			System.out.println("Homepage is displayed");
		}
		else
		{
			System.out.println("Homepage not displayed");
		}
		
		WebElement LOT=Driver.findElement(By.linkText("Logout"));
		if(LOT.isDisplayed())
				{
					System.out.println("Logout links are displayed");
				}
		
		WebElement PIM=Driver.findElement(By.id("pim"));
		Act.moveToElement(PIM).perform();
		
		WebElement ADDEMP=Driver.findElement(By.linkText("Add Employee"));
		Act.moveToElement(ADDEMP).perform();
		ADDEMP.click();
		
		Driver.switchTo().frame("rightMenu");
		
		if(Driver.findElement(By.xpath("//div[@class='mainHeading']")).getText().equals("PIM : Add Employee"))
		{
			System.out.println("Add Employ Page is displayed");
		}
		else
		{
			System.out.println("Add Employ page not displayed");
		}
		Thread.sleep(2000);
		
		//All Fields Empty
		WebElement Save=Driver.findElement(By.id("btnEdit"));
		
		//By First name empty
		String EMPID=Driver.findElement(By.id("txtEmployeeId")).getAttribute("value");
		String SLN="M";
		Driver.findElement(By.name("txtEmpLastName")).sendKeys(SLN);
		System.out.println("Lastname entered");
						
	//By giving all fields
		String SFN="Saritha";
		Driver.findElement(By.name("txtEmpFirstName")).sendKeys(SFN);
		System.out.println("Firstname entered");
		
		//Choosefile
		Driver.findElement(By.id("photofile")).click();
		
		//AutoIT
		
		Runtime.getRuntime().exec("C:\\Users\\QAP35\\Desktop\\Popup.exe");
		Thread.sleep(3000);
		Save.click();
	}

}
