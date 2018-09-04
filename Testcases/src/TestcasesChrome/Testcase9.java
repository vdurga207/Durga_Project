package TestcasesChrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Testcase9 {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		WebDriverWait Wait=new WebDriverWait(Driver,60);
		Actions Act=new Actions(Driver);
		
	
		
		//To open Webpage
		Driver.get("http://apps.qaplanet.in/qahrm/login.php");
		//To verify webpage
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
				String SUN="qaplanet1";
				String SPWD="lab1";
				UN.clear();
				UN.sendKeys(SUN);
				PWD.clear();
				PWD.sendKeys(SPWD);
				LIN.click();
				WebElement CPWD=Driver.findElement(By.linkText("Change Password"));
				WebElement LOT=Driver.findElement(By.linkText("Logout"));
				if(CPWD.isDisplayed() && LOT.isDisplayed())
						{
							System.out.println("Changepassword and Logout links are displayed");
						}
//verify the Admin tab and move to it
				
				WebElement Admin=Wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Admin")));
				Act.moveToElement(Admin).perform();
				Thread.sleep(1000);
		//Verify the option under the Admin tab
				
//Verify the option under the Admin tab
				
				WebElement Com=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='admin']/ul/li[1]/a/span")));
				if(Com.isDisplayed())
				{
					System.out.println("Company Info is displayed");
				}
				
				WebElement Job=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[2]/a/span"));
				if(Job.isDisplayed())
				{
					System.out.println("Job is displayed");
				}
				
				WebElement Qua=Driver.findElement(By.linkText("Qualification"));
				if(Qua.isDisplayed())
				{
					System.out.println("Qualification is displayed");
				}
				
				WebElement Ski=Driver.findElement(By.linkText("Skills"));
				if(Ski.isDisplayed())
				{
					System.out.println("Skills is displayed");
				}
				
				WebElement MS=Driver.findElement(By.linkText("Memberships"));
				if(MS.isDisplayed())
				{
					System.out.println("Memberships is displayed");
				}
				
				WebElement NS=Driver.findElement(By.linkText("Nationality & Race"));
				if(NS.isDisplayed())
				{
					System.out.println("Nationality & Race is displayed");
				}
				
				WebElement Users=Driver.findElement(By.linkText("Users"));
				if(Users.isDisplayed())
				{
					System.out.println("Users is displayed");
				}
				
				WebElement EN=Driver.findElement(By.linkText("Email Notifications"));
				if(EN.isDisplayed())
				{
					System.out.println("Email Notifications is displayed");
				}
				
				WebElement PI=Driver.findElement(By.xpath("//*[@id='admin']/ul/li[9]/a/span"));
				if(PI.isDisplayed())
				{
					System.out.println("Project Info is displayed");
				}
				
				WebElement DIE=Driver.findElement(By.linkText("Data Import/Export"));
				if(DIE.isDisplayed())
				{
					System.out.println("Data Import/Export");
				}
				
				WebElement CF=Driver.findElement(By.linkText("Custom Fields"));
				if(CF.isDisplayed())
				{
					System.out.println("Custom Fields is displayed");
				}
				Thread.sleep(1000);
				
				
				Act.moveToElement(Job).perform();
				Thread.sleep(1000);
				
				WebElement JTitle=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[2]/ul/li[1]/a/span"));
				if(JTitle.isDisplayed())
				{
					System.out.println("Job Titles is displayed");
				}
				
				WebElement JSpecifications=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[2]/ul/li[2]/a/span"));
				if(JSpecifications.isDisplayed())
				{
					System.out.println("Job Specifications is displayed");
				}
				
				WebElement JPG=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[2]/ul/li[3]/a/span"));
				if(JPG.isDisplayed())
				{
					System.out.println("Pay Grades is displayed");
				}
				
				WebElement ES=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[2]/ul/li[4]/a/span"));
				if(ES.isDisplayed())
				{
					System.out.println("Employment Status is displayed");
				}
				
				WebElement EJC=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[2]/ul/li[5]/a/span"));
				if(EJC.isDisplayed())
				{
					System.out.println("Job is displayed");
				}
			//Click on JOb
				//Act.moveToElement(JTitle).perform();
				//Act.click(JTitle);
				JTitle.click();
			//Switch to frame
				Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
				Thread.sleep(1000);
				if(Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Job : Job Title"))
				{
					System.out.println("Job : Job Title is displayed");
				}
				else
				{
					System.out.println("Job : Job Title is not displayed");
				}
		//Verify the Search by,search bar,search,reset,add,delete buttons
				WebElement SEL=Driver.findElement(By.xpath("//select[@id='loc_code']"));
				if(SEL.isDisplayed())
				{
					System.out.println("Search by is displayed");
				}
				
				
				WebElement SER=Driver.findElement(By.xpath("//div[@class='searchbox']/input[1]"));
				if(SER.isDisplayed())
				{
					System.out.println("Search bar is displayed");
				}
				
				WebElement SERB=Driver.findElement(By.xpath("//div[@class='searchbox']/input[2]"));
				if(SERB.isDisplayed())
				{
					System.out.println("Search button is displayed");
				}
				
				WebElement RSET=Driver.findElement(By.xpath("//div[@class='searchbox']/input[3]"));
				if(RSET.isDisplayed())
				{
					System.out.println("RESET button is displayed");
				}
				
				WebElement ADD=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")));
				if(ADD.isDisplayed())
				{
					System.out.println("ADD button is displayed");
				}
				
				WebElement DEL=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionbuttons']/input[2]")));
				if(DEL.isDisplayed())
				{
					System.out.println("DELETE button is displayed");
				}
				Thread.sleep(1000);
		//Click on add button
				ADD.click();
				Thread.sleep(3000);
				
		//Navigation after clicking add button
				
				  Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Job : Job Titles");
		
					System.out.println("Job : Job Title page displayed");
		
		
					Thread.sleep(1000);
					
		//Click Save with all fields empty
					Driver.findElement(By.xpath("//div[@class='formbuttons']/input")).click();
					Thread.sleep(1000);
					
	//Switch to alert after clicking Save Button
					
					Alert A1=Wait.until(ExpectedConditions.alertIsPresent());
					
					Thread.sleep(1000);
				
					if(A1.getText().equals("Job Title Name should be specified"))
					{
						
						System.out.println(A1.getText());
						A1.accept();
					}
					else
					{
						System.out.println("Alert not displayed");
					}
					Thread.sleep(1000);
		//Enter Title Name 		
					WebElement JTName=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txtJobTitleName']")));
					JTName.sendKeys("QA Engineer");
					
		//Click Save with all fields empty
					Driver.findElement(By.xpath("//div[@class='formbuttons']/input")).click();
					Thread.sleep(1000);
		
		//Switch to alert
					Alert A2=Wait.until(ExpectedConditions.alertIsPresent());
					
					Thread.sleep(1000);
				
					if(A2.getText().equals("Job Description should be specified"))
					{
						
						System.out.println(A2.getText());
						A2.accept();
					}
					else
					{
						System.out.println("Alert not displayed");
					}
					Thread.sleep(1000);
					
					
					WebElement JD=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='txtJobTitleDesc']")));
					JD.sendKeys("Testing WebApps");
				
			//Click Save with all fields empty
					Driver.findElement(By.xpath("//div[@class='formbuttons']/input")).click();
					Thread.sleep(1000);
					
		//Click on Edit
					WebElement Edit =Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='editBtn']")));
			        Edit.click();
			        
			   //verify Emp Status fields
			        
			        WebElement AES=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@id='frmJobTitle']/div[2]/input[1]")));
			        if(AES.isDisplayed())
			        {
			        	System.out.println("Add Employee is displayed");
			        }
			        
			        AES.click();
			        Thread.sleep(1000);
			        
			        WebElement AEStatus=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txtEmpStatDesc']")));
			       String ASE1="QA Engineer Full time";
			        AEStatus.sendKeys(ASE1);
			        
			        WebElement ESSave=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='btnEmpStat']")));
			        ESSave.click();
			        
			        WebElement DD=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='cmbUnAssEmploymentStatus']")));
			        
			        Act.moveToElement(DD).perform();
			        Thread.sleep(1000);
			        if (DD.getText().contains(ASE1)) 
			        {
					System.out.println(ASE1+ " is displayed");
					}
		
			        
			       /*//Verify Edit Employee status
			        
			        WebElement EES=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@id='frmJobTitle']/div[2]/input[2]")));
			        if(EES.isDisplayed())
			        {
			        	System.out.println("Edit Employee is displayed");
			        }*/
			        
			        WebElement ESSave1=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='editBtn']")));
			        ESSave1.click();

	
	}
}
