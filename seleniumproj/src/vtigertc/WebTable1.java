package vtigertc;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable1 {

	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
					ChromeDriver x=new ChromeDriver();
					WebDriverWait wait=new WebDriverWait(x,30);
					x.get("");
	}

}
}
