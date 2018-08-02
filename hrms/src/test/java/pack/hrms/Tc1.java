package pack.hrms;

import java.sql.Timestamp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc1 {
	WebDriver w;
	 Actions a;
	 String fn;
	 String ln;
	 public  String code;
	 Timestamp ts;
	 Alert al,al1;
	@Given("^openbrowser and url$")
	public void openbrowser_and_url() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\chromedriver.exe");
	   w=new ChromeDriver();
	   w.get("http://apps.qaplanet.in/qahrm/login.php");
	}
	@When("^Enter un and pwd \"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_un_and_pwd(String UN,String PWD) throws Throwable {
		w.findElement(By.name("txtUserName")).sendKeys(UN);
		w.findElement(By.name("txtPassword")).sendKeys(PWD);  
	}

	@Then("^click on login$")
	public void click_on_login() throws Throwable {
		w.findElement(By.name("Submit")).click();  
	}

	@Then("^click on  Add$")
	public void click_on_Add() throws Throwable {
	    a=new Actions(w);
	  WebElement p= w.findElement(By.linkText("PIM"));
	  a.moveToElement(p).perform();
	  w.findElement(By.linkText("Add Employee")).click();
	}
	//@Test
	@When("^enter fn,ln\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_fn_ln(String fn,String ln) throws Throwable {
		ts=new Timestamp(System.currentTimeMillis());
		this.fn=fn;
		this.ln=ln+" "+ts;
		
		w.switchTo().frame("rightMenu");
	   code=w.findElement(By.id("txtEmployeeId")).getAttribute("value");
	   w.findElement(By.name("txtEmpLastName")).sendKeys(ln+" "+ts);
	   w.findElement(By.name("txtEmpFirstName")).sendKeys(fn);
	}

	@Then("^click on save$")
	public void click_on_save() throws Throwable {
	   WebElement save= w.findElement(By.className("savebutton"));
	   save.click();
	    al=w.switchTo().alert();
	    if(al.getText().equals("Last Name contains numbers. Do you want to continue?"))
	    {
	    	System.out.println("Last Name contains numbers. Do you want to continue?  is displayed" );
	    	al.accept();
	    }
	  /*  al1=w.switchTo().alert();
	    if(al1.getText().equals("First Name contains numbers. Do you want to continue?"))
	    {
	    	System.out.println("First Name contains numbers. Do you want to continue?  is displayed" );
	    	al1.accept();
	    }*/
	    Thread.sleep(1000);
	}
	//@Test(dependsOnMethods={"enter_fn_ln"})
	@Then("^verify$")
	public void verify() throws Throwable {
		 w.switchTo().defaultContent();
		  WebElement p= w.findElement(By.linkText("PIM"));
		  a.moveToElement(p).perform();
		  w.findElement(By.linkText("Employee List")).click();
		  w.switchTo().frame("rightMenu");
		  Thread.sleep(1000);
	   String name=w.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),'"+code+"')]/following-sibling::td/a")).getText();
	   System.out.println(name);
	  System.out.println(fn+" "+ln);
	   if(name.contains(fn+" "+ln))
	   {
		   System.out.println(name+" "+"is displayed");
	   }
	   else
	   {
		   System.out.println("not found");
	   }
	}

}
