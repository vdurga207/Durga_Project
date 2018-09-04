package TestcasesChrome;


/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;*/

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase8 {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		WebDriverWait Wait=new WebDriverWait(Driver,60);
		Actions Act=new Actions(Driver);
		
		
		
		//To open Webpage
		Driver.get("http://apps.qaplanet.in/qahrm/login.php");
		WebElement UN=Wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
		WebElement PWD=Wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
		WebElement LIN=Wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
		WebElement CLR=Wait.until(ExpectedConditions.presenceOfElementLocated(By.name("clear")));
		String SUN="qaplanet1";
		String SPWD="lab1";
		UN.clear();
		UN.sendKeys(SUN);
		PWD.clear();
		PWD.sendKeys(SPWD);
		LIN.click();
		
	//verify the Admin tab and move to it
			
			WebElement Admin=Wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Admin")));
			Act.moveToElement(Admin).perform();
			Thread.sleep(1000);
	//Verify the option under the Admin tab
			
			WebElement Com=Wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Company Info")));
			Act.moveToElement(Com).perform();
			Thread.sleep(1000);
			
			WebElement LOC=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[1]/ul/li[2]/a/span"));
			Act.moveToElement(LOC).perform();
			LOC.click();
			Thread.sleep(1000);
			
			//Verify the Navigation by clicking on location
			Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
			Thread.sleep(1000);
			for(int i=1;i<=5;i++)
			{
				WebElement CC=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr ["+i+"]/td[1]/input"));
				if(i%2==0)
				{
					CC.click();
				
				}
				
			}
	
			/*{
				List<WebElement> checkboxes=Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr/td[1]/input"));
				Iterator<WebElement> Itr=checkboxes.iterator();
				while(Itr.hasNext())
				{
					WebElement E=Itr.next();
					E.click();
				}
				
			}*/
				Thread.sleep(2000);
				WebElement DEL1=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionbuttons']/input[2]")));
				DEL1.click();
				Alert A5=Driver.switchTo().alert();
				Thread.sleep(1000);
				if(A5.getText().equals("Deletion might affect Company Hierarchy. If the Location has associations deletion may fail. Do you want to delete ?"))
				{
					System.out.println("Alert is displayed");
					A5.accept();
				}
				else
				{
					System.out.println("Alert is not displayed");
				}
				Thread.sleep(2000);
               
				WebElement SMSG=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='messagebar']/span")));
				
				if(SMSG.getText().equals("Successfully Deleted"))
				{
					System.out.println(SMSG.getText());
				}
				Thread.sleep(1000);
  
		}
}

