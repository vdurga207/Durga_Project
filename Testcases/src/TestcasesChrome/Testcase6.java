package TestcasesChrome;

import java.sql.Timestamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase6 {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		
		
		Driver.manage().window().maximize();
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
				
				WebElement Admin=Wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Admin")));
				Act.moveToElement(Admin).perform();
				Thread.sleep(1000);
		//Company info
				WebElement Com=Wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Company Info")));
				//Move to company Info
				Act.moveToElement(Com).perform();
				Thread.sleep(1000);
		//Location
				WebElement LOC=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[1]/ul/li[2]/a/span"));
				Act.moveToElement(LOC).perform();
				LOC.click();
				Thread.sleep(1000);
			//Verify the Navigation by clicking on location
				Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
				Thread.sleep(1000);
				//Click on add button
				WebElement ADD=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionbuttons']/input[1]")));
				ADD.click();
				Thread.sleep(3000);
		//Verify the navigation after clicking add
				  Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Company Info : Locations");
		
					System.out.println("Company Info : Locations page displayed");
		
		
					Thread.sleep(1000);
					Timestamp TS=new Timestamp(System.currentTimeMillis());
					//Enter the name
					String locname="Hyderabad"+TS;
					WebElement LN=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@id='frmLocation']/input[2]")));
					LN.sendKeys(locname);
					//Enter the country
					WebElement CON=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='cmbCountry']")));
					Select SEL1=new Select(CON);
					SEL1.selectByVisibleText("India");
					//Verify Address and Enter 
					String ASS="SRT-322,Sanathnagr";
					WebElement ADS=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='txtAddress']")));
					ADS.sendKeys(ASS);
					Thread.sleep(1000);
					//Verify and Enter Zipcode
					WebElement ZC=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txtZIP']")));
					ZC.sendKeys("500018");
					//Click Save
					Driver.findElement(By.xpath("//div[@class='formbuttons']/input")).click();
					Thread.sleep(1000);
					//Verify in the table
					
					
					int RC=Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
					
					System.out.println(RC);
					
					
					
				
					for( int i=1;i<=RC;i++)
				{
					WebElement LName=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a"));
						
						if(LName.getText().equals(locname))
					{
						System.out.println(locname+ " displayed at " +i );
						LName.click();
						break;
						
					}
				}
				Thread.sleep(1000);
				//Edit Location Name
				WebElement LEdit=Driver.findElement(By.xpath("//input[@id='editBtn']"));
				Thread.sleep(1000);
				LEdit.click();
				
				WebElement LN1=Driver.findElement(By.xpath("//input[@id='txtLocDescription']"));
				String LNE="Banglore " +TS;
				LN1.clear();
				LN1.sendKeys(LNE);
				Thread.sleep(1000);
				
				WebElement City=Driver.findElement(By.xpath("//input[@id='cmbDistrict']"));
				City.clear();
				City.sendKeys("Hyderabad");
				Thread.sleep(1000);
				
				//Click  save
				Driver.findElement(By.xpath("//div[@class='formbuttons']/input")).click();

				Thread.sleep(1000);
				//Verify updated msg
				
				WebElement SMSG=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='messagebar']/span")));
				
				if(SMSG.getText().equals("Successfully Updated"))
				{
					System.out.println(SMSG.getText());
				}
				Thread.sleep(1000);
				
     }
}