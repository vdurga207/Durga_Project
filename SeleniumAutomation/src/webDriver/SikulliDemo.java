package webDriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikulliDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\QAP35\\Downloads\\e\\DRIVERS\\geckodriver.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setVersion("your firefox version");
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver();
		
		String filepath = "C:\\Users\\QAP35\\Desktop\\";
        String inputFilePath = "C:\\Users\\QAP35\\Desktop\\";
		Screen s = new Screen();
		Pattern fileInputTextBox = new Pattern(filepath + "FileNameTextbox.png");
		Pattern openButton = new Pattern(inputFilePath + "OpenButton.png");
		
		driver.get("http://demo.guru99.com/test/image_upload/index.php");
		
		// Click on Browse button and handle windows pop up using Sikuli
		driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
        try {
			s.wait(fileInputTextBox, 20);
			s.type(fileInputTextBox, "test.txt");
			s.click(openButton);
		} 
        
        catch (FindFailed e) {
			e.printStackTrace();
		}
       
	}

}
