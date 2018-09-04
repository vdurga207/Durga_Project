package TestcasesChrome;

import java.sql.Timestamp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase7 {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		
		Timestamp TS=new Timestamp(System.currentTimeMillis());
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
						
						WebElement Com=Wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Company Info")));
						Act.moveToElement(Com).perform();
						Thread.sleep(1000);
						
						WebElement LOC=Driver.findElement(By.xpath("//li[@id='admin']/ul/li[1]/ul/li[2]/a/span"));
						Act.moveToElement(LOC).perform();
						LOC.click();
						
						Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
						Thread.sleep(1000);
						
						WebElement ADD=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionbuttons']/input[1]")));
						
						//Click on add button
						ADD.click();
						Thread.sleep(3000);
						
						String locname="Hyderabad"+TS;
						WebElement LN=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@id='frmLocation']/input[2]")));
						LN.sendKeys(locname);
						
						WebElement CON=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='cmbCountry']")));
						Select SEL1=new Select(CON);
						SEL1.selectByVisibleText("India");
						
						String ASS="SRT-322,Sanathnagr";
						WebElement ADS=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='txtAddress']")));
						ADS.sendKeys(ASS);
						Thread.sleep(1000);
						
						WebElement ZC=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txtZIP']")));
						ZC.sendKeys("500018");
						
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
								System.out.println(LName.getText()+ " displayed at " +i );
								//LName.click();
								break;
								
							}
						}
						Thread.sleep(1000);
				
				
				
		//Testcase:7

		//Delete Location
						

		      /*WebElement CB1=Driver.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),([//table[@class='data-table']/tbody/tr[7]/td[contains(text(),Hyderabad "+TS"));
				CB1.click();*/
				
				Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[3]/td[1]/input")).click();
				Thread.sleep(1000);
			
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
				Thread.sleep(1000);
				
				WebElement SMSG=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='messagebar']/span")));
				
				if(SMSG.getText().equals("Successfully Deleted"))
				{
					System.out.println(SMSG.getText());
				}
				Thread.sleep(1000);
			
	}

}
