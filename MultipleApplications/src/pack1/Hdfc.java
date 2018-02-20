package pack1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hdfc {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
		ChromeDriver x=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(x,30);
x.get("https://www.hdfcbank.com/");
Thread.sleep(2000);
Actions A=new Actions(x);
WebElement mp=x.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[3]/div[1]/a"));
A.moveToElement(mp).perform();
List<WebElement> li=x.findElements(By.xpath("//*[@id='area-header']/div/div[2]/div[2]/ul/li[3]/div[2]/div[2]/div[1]/ul/li/span"));
/*Iterator<WebElement> l=li.iterator();
while(l.hasNext())
{
	
}*/
for(WebElement t:li)
{
	

System.out.println(t.getText());
}	}

}
