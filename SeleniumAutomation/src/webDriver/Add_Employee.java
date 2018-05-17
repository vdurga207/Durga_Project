package webDriver;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Add_Employee {

	public static void main(String[] args) throws Exception {
		 /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP35\\Downloads\\e\\DRIVERS\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();*/
		 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\QAP35\\Downloads\\e\\DRIVERS\\geckodriver.exe");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities = DesiredCapabilities.firefox();
		 capabilities.setBrowserName("firefox");
		 capabilities.setVersion("your firefox version");
		 capabilities.setPlatform(Platform.WINDOWS);
		 capabilities.setCapability("marionette", true);
		 WebDriver driver = new FirefoxDriver();
		 //driver.manage().window().maximize();
	     driver.get("http://apps.qaplanet.in/qahrm/login.php"); //to open the application
	       
	        /*LoginValidation*/
	        driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");//Input to Login Name
	        driver.findElement(By.name("txtPassword")).sendKeys("lab1");//Input to Login Name
	        driver.findElement(By.name("Submit")).click();
	        
	        /*Frame selection*/
	        driver.switchTo().frame("rightMenu");
	        
	        //--Moving into Add Employee Page--//
	        WebElement e1 = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")); //works with firefox
	        /*WebElement e1 = driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/div[1]/h2"));   //works with chrome*/
	        e1.click();
	           
	      /*To get the text from the Add Employee page*/
	       String stext = driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/div[1]/h2")).getText();
	        System.out.println(stext);
	        
	        String e2 = driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/label[1]")).getText();
	        System.out.println(e2);
	        
	        String e3 = driver.findElement(By.xpath("//input[@id='txtEmployeeId']")).getText();  //By.xpath("//*[@id='txtEmployeeId']"),id("txtEmployeeId"),By.className("formInputText"),//input[@type='text'],//*[@id='txtEmployeeId']
	        String sEMPCode1=driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
	        String S=e3.concat(sEMPCode1);
	        System.out.print(S);

	        String e4 = driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/label[2]")).getText();
	        System.out.println(e4);
	         driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("Data");
	      
	        
	        String e5 = driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/label[3]")).getText();
	        System.out.println(e5);
	        
	        
	        driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("Test");
	     
	        String e6 = driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/label[4]")).getText();
	        System.out.println(e6);
	        driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/input[@id='txtEmpMiddleName']")).sendKeys("Driven");
	        
	        String e7 = driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/label[5]")).getText();
	        System.out.println(e7);
	        driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/input[@id='txtEmpNickName']")).sendKeys("NA");
	        
	        String e8 = driver.findElement(By.xpath("//*[@id='frmEmp']/div/div[1]/div[2]/label[6]")).getText();
	        System.out.println(e8);
	        
	        Thread.sleep(2000);
	        //--clicking on the image button for uploading purpose--//
	        WebElement Brow = driver.findElement(By.id("photofile"));
	        if(Brow.isDisplayed()){
	        	System.out.println("Bro");
	        }
	        else{
	        	System.out.println("");
	        }
	        //driver.findElement(By.xpath(".//input[@type='file']")).click();
	       WebElement svebtn= driver.findElement(By.id("photofile"));
	       svebtn.click();
	       
	       //--Using sikulli to automate windows popups for selection of image--//
	       String fileinputpath = "C:\\Users\\QAP35\\Desktop\\";
	       String OpeninginputFilePath = "C:\\Users\\QAP35\\Desktop\\";
	       Screen s = new Screen();
	       Pattern fileinputTextbox = new Pattern(fileinputpath + "FileNameTextbox.PNG");
	       Pattern OpenButton = new Pattern(OpeninginputFilePath + "OpenButton.png");
	       s.wait(fileinputTextbox, 20);
	       s.type(fileinputTextbox, "user.PNG");
	       s.click(OpenButton);
	       
	       //click on save button
	       driver.findElement(By.xpath("//*[@class='savebutton']")).click();
	       
	       //--Moving into Employee Personal Information page--//
	       /*To get the text from the Personal Information page*/
	       String e9 = driver.findElement(By.xpath("/html/body/form/div[2]/div[1]/div[2]/div[1]/h2")).getText();
	        System.out.println(e9);
	        System.out.println("hi ramakrishna");
	       
	}

}
