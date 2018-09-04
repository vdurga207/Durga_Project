package TestcasesFirefox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test5 {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Demp\\geckodriver-v0.21.0-win32\\geckodriver.exe");
		FirefoxDriver Driver=new FirefoxDriver();
		WebDriverWait Wait=new WebDriverWait(Driver,60);
		Actions Act=new Actions(Driver);
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
		String WETXT=Driver.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText();
		if(WETXT.equals("Welcome"+SUN))
		{
			System.out.println("Welcome "+SUN+" displayed");
		}
		String[] Arr=WETXT.split(" ");
		if(Arr[1].equals(SUN))
		{
			System.out.println(SUN+" displayed");
		}
		WebElement CPWD=Driver.findElement(By.linkText("Change Password"));
		WebElement LOT=Driver.findElement(By.linkText("Logout"));
		if(CPWD.isDisplayed() && LOT.isDisplayed())
				{
					System.out.println("Changepassword and Logout links are displayed");
				}
		Thread.sleep(1000);
		
//verify the Admin tab and move to it
		
		WebElement Admin=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id='admin']/a/span")));
		Act.moveToElement(Admin).perform();
		Thread.sleep(1000);
//Verify the option under the Admin tab
		
		WebElement Com=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id='admin']/ul/li[1]/a/span")));
		if(Com.isDisplayed())
		{
			System.out.println("Company Info is displayed");
		}
		
		WebElement Job=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[2]/a/span"));
		if(Job.isDisplayed())
		{
			System.out.println("Job is displayed");
		}
		
		WebElement Qua=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[3]/a/span"));
		if(Qua.isDisplayed())
		{
			System.out.println("Qualification is displayed");
		}
		
		WebElement Ski=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[4]/a/span"));
		if(Ski.isDisplayed())
		{
			System.out.println("Skills is displayed");
		}
		
		WebElement MS=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[5]/a/span"));
		if(MS.isDisplayed())
		{
			System.out.println("Memberships is displayed");
		}
		
		WebElement NS=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[6]/a/span"));
		if(NS.isDisplayed())
		{
			System.out.println("Nationality & Race is displayed");
		}
		
		WebElement Users=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[7]/a/span"));
		if(Users.isDisplayed())
		{
			System.out.println("Users is displayed");
		}
		
		WebElement EN=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[8]/a/span"));
		if(EN.isDisplayed())
		{
			System.out.println("Email Notifications is displayed");
		}
		
		WebElement PI=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[9]/a/span"));
		if(PI.isDisplayed())
		{
			System.out.println("Project Info is displayed");
		}
		
		WebElement DIE=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[10]/a/span"));
		if(DIE.isDisplayed())
		{
			System.out.println("Data Import/Export");
		}
		
		WebElement CF=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[11]/a/span"));
		if(CF.isDisplayed())
		{
			System.out.println("Custom Fields is displayed");
		}
		Thread.sleep(1000);
//Move to company Info
		Act.moveToElement(Com).perform();
		Thread.sleep(1000);

//Verify the options in company info
		
		WebElement GEN=Driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/ul/li[1]/ul/li[1]/a/span"));
		if(GEN.isDisplayed())
		{
			System.out.println("General is displayed");
		}
		
		WebElement LOC=Driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/ul/li[1]/ul/li[2]/a/span"));
		if(LOC.isDisplayed())
		{
			System.out.println("Locations is displayed");
		}
		
		WebElement CS=Driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/ul/li[1]/ul/li[3]/a/span"));
		if(CS.isDisplayed())
		{
			System.out.println("Company Structure is displayed");
		}
		
		WebElement CP=Driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/ul/li[1]/ul/li[4]/a/span"));
		if(CP.isDisplayed())
		{
			System.out.println("Company Property is displayed");
		}
		
		
		
		Act.moveToElement(LOC).perform();
		Thread.sleep(1000);
		LOC.click();
		Thread.sleep(1000);
//Verify the Navigation by clicking on location
		Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
		Thread.sleep(1000);
		if(Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Company Info : Locations"))
		{
			System.out.println("Company Info : Locations page displayed");
		}
		else
		{
			System.out.println("Company Info : Locations page displayed");
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
		
		WebElement ADD=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionbuttons']/input[1]")));
		if(ADD.isDisplayed())
		{
			System.out.println("ADD button is displayed");
		}
		
		WebElement DEL=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionbuttons']/input[2]")));
		if(DEL.isDisplayed())
		{
			System.out.println("DELETE button is displayed");
		}
//Click on add button
		ADD.click();
		Thread.sleep(3000);
//Verify the navigation after clicking add
		  Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Company Info : Locations");

			System.out.println("Company Info : Locations page displayed");


			Thread.sleep(1000);
//Click on save Button with Empty fields
						Driver.findElement(By.xpath("//div[@class='formbuttons']/input")).click();

		Thread.sleep(1000);

//Switch to alert after clicking Save Button
		
		Alert A1=Wait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(1000);
	
		if(A1.getText().equals("Please correct the following\n\n\t- Location Name has to be specified\n\t- Country should be selected!\n\t- Address should be specified\n\t- Zip Code should be specified\n"))
		{
			
			System.out.println(A1);
			A1.accept();
		}
		else
		{
			System.out.println("Alert not displayed");
		}
		Thread.sleep(1000);
	//Enter the name
		WebElement LN=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@id='frmLocation']/input[2]")));
		LN.sendKeys("Hyderabad");
		
	//Click  save
		Driver.findElement(By.xpath("//div[@class='formbuttons']/input")).click();

		Thread.sleep(1000);
		
// Switch to Alert
		Alert A2=Driver.switchTo().alert();
		Thread.sleep(1000);
		if(A2.getText().equals("Please correct the following\n\n\t- Country should be selected!\n\t- Address should be specified\n\t- Zip Code should be specified\n"))
		{
			System.out.println("Alert is displayed");
			A2.accept();
		}
		else
		{
			System.out.println("Alert is not displayed");
		}
		Thread.sleep(1000);
	//Select the country
		WebElement CON=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='cmbCountry']")));
		Select SEL1=new Select(CON);
		SEL1.selectByVisibleText("India");
		
	//Click  Save
		Driver.findElement(By.xpath("//div[@class='formbuttons']/input")).click();
		Thread.sleep(1000);
		
	//Switch to Alert
		Alert A3=Driver.switchTo().alert();
		Thread.sleep(1000);
		if(A3.getText().equals("Please correct the following\n\n\t- Address should be specified\n\t- Zip Code should be specified\n"))
		{
			System.out.println("Alert is displayed");
			A3.accept();
		}
		else
		{
			System.out.println("Alert is not displayed");
		}
	//Verify Address and Enter 
		String ASS="SRT-322,Sanathnagr";
		WebElement ADS=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='txtAddress']")));
		ADS.sendKeys(ASS);
		Thread.sleep(1000);
		
	//Click Save
		Driver.findElement(By.xpath("//div[@class='formbuttons']/input")).click();
		Thread.sleep(1000);
		
	//Switch to alert
		
		Alert A4=Driver.switchTo().alert();
		Thread.sleep(1000);
		if(A4.getText().equals("Please correct the following\n\n\t- Zip Code should be specified\n"))
		{
			System.out.println("Alert is displayed");
			A4.accept();
		}
		else
		{
			System.out.println("Alert is not displayed");
		}
	
	//Verify and Enter Zipcode
		WebElement ZC=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txtZIP']")));
		ZC.sendKeys("500018");
		
	//Click Save
		Driver.findElement(By.xpath("//div[@class='formbuttons']/input")).click();
		Thread.sleep(1000);
		
	//Verify in the table
		
		int RC=Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
		
		System.out.println(RC);
	
	for(int i=1;i<=RC;i++)
	{
		
		String LName=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
		if(LName.equals("Hyderabad"))
		{
			System.out.println(LName+ " displayed at " +i );
			
		}
	}
}
}
	