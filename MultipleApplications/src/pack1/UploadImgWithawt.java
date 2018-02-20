package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadImgWithawt {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
		ChromeDriver x=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(x,30);
		JavascriptExecutor js=(JavascriptExecutor)x;
x.get("https://mail.google.com/mail");
Thread.sleep(3000);
WebElement un=x.findElement(By.id("identifierId"));
un.clear();
un.sendKeys("vdurga207");
x.findElement(By.cssSelector("#identifierNext > content > span")).click();
Thread.sleep(2000);
WebElement pwd=x.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
pwd.clear();
pwd.sendKeys("veerla234");
x.findElement(By.cssSelector("#passwordNext > content > span")).click();
Thread.sleep(3000);

	}

}
