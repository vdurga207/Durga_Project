package pack1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
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
//x.switchTo().frame("hist_frame");
//click on logout
x.findElement(By.cssSelector
("#gb > div.gb_Hf.gb_Fg > div.gb_kb.gb_Fg.gb_R.gb_Eg.gb_X.gb_T > div.gb_Bc.gb_Fg.gb_R > div.gb_hb.gb_6c.gb_Fg.gb_R > div.gb_Nc.gb_jb.gb_Fg.gb_R > a > span")).click();
x.findElement(By.xpath("//*[@id='gb_71']"));
Thread.sleep(3000);
/*List<WebElement> list=x.findElements(By.xpath("//*[@id=':i4']/div/div[2]/div"));
Iterator it=list.iterator();
while(it.hasNext())
{
	WebElement s=(WebElement) it.next();
	System.out.println(s.getText());
}*/

	}

}
