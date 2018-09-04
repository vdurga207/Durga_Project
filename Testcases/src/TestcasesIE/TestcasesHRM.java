package TestcasesIE;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestcasesHRM {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.ie.driver","D:\\Selenium_Demp\\IEDriverServer.exe");
		InternetExplorerDriver	Driver=new InternetExplorerDriver();
		//To maximize Browser
				Driver.manage().window().maximize();
				Thread.sleep(3000);
				
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
				
		//Testcase-2
				
				WebElement PIM=Driver.findElement(By.id("pim"));
				Act.moveToElement(PIM).perform();
				Driver.findElement(By.linkText("Add Employee")).click();
				Thread.sleep(2000);
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
				Save.click();
				Alert A=Wait.until(ExpectedConditions.alertIsPresent());
				if(A.getText().equals("Last Name Empty!"))
				{
					System.out.println("Last name empty alert is displayed");
				}
				else
				{
					System.out.println("Last name empty alert is not displayed");
				}
				Thread.sleep(1000);
				A.accept();
				//By First name empty
				String EMPID=Driver.findElement(By.id("txtEmployeeId")).getAttribute("value");
				String SLN="M";
				Driver.findElement(By.name("txtEmpLastName")).sendKeys(SLN);
				System.out.println("Lastname entered");
				Save.click();
				Thread.sleep(2000);
				Alert A1=Wait.until(ExpectedConditions.alertIsPresent());
				if(A1.getText().equals("First Name Empty!!"))
				{
					System.out.println("First Name Empty! alert is displayed");
				}
				else
				{
					System.out.println("First Name Empty! is not displayed");
				}
				A1.accept();
				
			//By giving all fields
				String SFN="Saritha";
				Driver.findElement(By.name("txtEmpFirstName")).sendKeys(SFN);
				System.out.println("Firstname entered");
				Save.click();
				Thread.sleep(1000);
				if(Wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='mainHeading']"),"Personal Details")))
				{
					System.out.println("Personal Details page is displayed");
				}
				else
				{
					System.out.println("Personal Details page is not displayed");
					
				}
				
				Driver.switchTo().parentFrame();
				Act.moveToElement(PIM).perform();
				Driver.findElement(By.linkText("Employee List")).click();
				Thread.sleep(1000);
				Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
				Thread.sleep(1000);
				if(Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Employee Information"))
				{
					System.out.println("Employee Information page displayed");
				}
				else
				{
					System.out.println("Employee Information page displayed");
				}
				String EName=Driver.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),'"+EMPID+"')]/following-sibling::td/a")).getText();
				
				if(EName.equals(SFN+" "+SLN ))
				{
				System.out.println(EName+" displyed");
				}
				Driver.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),'"+EMPID+"')]/following-sibling::td/a")).click();
				if(Wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='mainHeading']"),"Personal Details")))
				{
					System.out.println("Personal Details page is displayed");
				}
				else
				{
					System.out.println("Personal Details page is not displayed");
					
				}
				Thread.sleep(1000);
				

				
		//Testcase-3
				
				WebElement Edit=Driver.findElement(By.xpath("//div[@class='formbuttons']/input"));
				Thread.sleep(1000);
				Edit.click();
				
				String SLN1="Masam";
				WebElement LName=Driver.findElement(By.name("txtEmpLastName"));
				LName.clear();
				LName.sendKeys(SLN1);
				Thread.sleep(1000);
				
				String SFN1="Sarithachakri";
				WebElement FName=Driver.findElement(By.name("txtEmpFirstName"));
				FName.clear();
				FName.sendKeys(SFN1);
				
				WebElement NN=Driver.findElement(By.xpath("//div[@class='maincontent']/input[6]"));
				NN.sendKeys("Sari");
				
				WebElement NT=Driver.findElement(By.xpath("//select[@id='cmbNation']"));
				Select S1=new Select(NT);
				S1.selectByValue("NAT001");
				
				WebElement MS=Driver.findElement(By.xpath("//select[@id='cmbMarital']"));
				Select S2=new Select(MS);
				S2.selectByVisibleText("Married");
				
				WebElement GEN=Driver.findElement(By.xpath("//div[@class='maincontent']/input[13]"));
				GEN.click();
				
			//Click on the Save Button
				
				Driver.findElement(By.xpath("//div[@class='formbuttons']/input")).click();
				
				Driver.switchTo().parentFrame();
				Act.moveToElement(PIM).perform();
				Driver.findElement(By.linkText("Employee List")).click();
				Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
				Thread.sleep(2000);

		//Testcase-4
				
				//Without selecting any record

				WebElement DEL=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionbuttons']/input[2]")));
				DEL.click();
				Thread.sleep(2000);
				
				Alert A2=Wait.until(ExpectedConditions.alertIsPresent());
				if(A1.getText().equals("Select at least one record to delete"))
				{
					System.out.println("Select at least one record to delete alert is displayed");
					A2.accept();
				}
				else
				{
					System.out.println("Select at least one record to delete is not displayed");
				}
				
				Thread.sleep(2000);
				
				/*WebElement CB=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[4]/td[1]/input"));
				CB.click();*/
				
				Driver.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),'"+EMPID+"')]/preceding-sibling::td/input")).click();
				Thread.sleep(1000);
				DEL.click();
				Thread.sleep(1000);
				
				WebElement SMSG=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='messagebar']/span")));
				
				if(SMSG.getText().equals("Successfully Deleted"))
				{
					System.out.println(SMSG.getText());
				}
				
				
					
				WebElement SEL=Driver.findElement(By.xpath("//select[@id='loc_code']"));
				Select SEL1=new Select(SEL);
				SEL1.selectByValue("0");
				Thread.sleep(1000);
				
				WebElement SER=Driver.findElement(By.xpath("//div[@class='searchbox']/input[1]"));
				SER.sendKeys(EMPID);
				Thread.sleep(1000);
				
				Driver.findElement(By.xpath("//div[@class='searchbox']/input[2]")).click();
				Thread.sleep(1000);
				
				WebElement SMSG1=Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionbar']/div[2]")));
				if(SMSG1.getText().equals("No Records to Display"))
				{
					System.out.println(SMSG1.getText());
				}
				
				Driver.switchTo().defaultContent();
				LOT.click();
				Driver.close();
				Driver.quit();
					}

}
