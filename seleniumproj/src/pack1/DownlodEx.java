package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownlodEx {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
		ChromeDriver x=new ChromeDriver();
		x.get("http://docs.seleniumhq.org/download/");
		Thread.sleep(3000);
		
		x.findElement(By.xpath("//*[@id='mainContent']/p[7]/a[1]")).click();
	}

}
