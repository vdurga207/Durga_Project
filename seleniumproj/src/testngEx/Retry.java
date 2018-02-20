package testngEx;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

abstract public class Retry implements IRetryAnalyzer {
    private int retryCount = 0;
    private int maxRetryCount = 9;

    public boolean retry(ITestResult result) {

        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }

    @Test(retryAnalyzer = Retry.class)
    public void testGenX() {
    	WebDriver d = new FirefoxDriver();
    	
        Assert.assertEquals("james", "JamesFail"); // ListenerTest fails
    }

    @Test(retryAnalyzer = Retry.class)
    public void testGenY() {
     
    	try {
    		
    	}catch(Exception e) {
    		
    	}
    	
    	Assert.assertEquals("hello", "World"); // ListenerTest fails

    }
    
public abstract void printer();

}