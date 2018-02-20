package pack1;

import java.awt.Window;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;



public class paytm {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
		ChromeDriver x=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(x,30);
		JavascriptExecutor js=(JavascriptExecutor)x;
x.get("https://paytm.com");
Thread.sleep(2000);
JavascriptExecutor js1=(JavascriptExecutor)x;
js1.executeScript("window.scrollBy(0,9000)");
List<WebElement> li=x.findElements(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[3]/div[16]/a"));
WritableWorkbook wwb=Workbook.createWorkbook(new File("D:\\paytm.xls"));
WritableSheet st=wwb.createSheet("book", 0);


for (int i = 0; i <li.size(); i++) {
	
System.out.println(li.get(i).getText());

Label l=new Label(0,i,li.get(i).getText());

st.addCell(l);



	
}

wwb.write();
wwb.close();












/*for(WebElement b:li)
{
	System.out.println(b.getText());


WritableWorkbook wwb=Workbook.createWorkbook(new File("D:\\paytm.xls"));
WritableSheet st=wwb.createSheet("book", 0);
st.findCell(b.getText());
wwb.write();
wwb.close();

	}*/

}}
