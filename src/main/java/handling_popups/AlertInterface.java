package handling_popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInterface {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("http://demo.guru99.com/test/delete_customer.php");
		d.manage().window().maximize();
		
		WebElement cid = d.findElement(By.name("cusid"));
		cid.click();
		cid.sendKeys("101");
		
		d.findElement(By.name("submit")).click();
		
		Alert alt = d.switchTo().alert();
		String text=alt.getText();   //to get the text from alert popup
		System.out.println(text);
		//alt.accept();
		alt.dismiss();   //to cancel the alert popup
		Thread.sleep(2000);
		String text2=alt.getText();
		System.out.println(text2);
		alt.accept();  //to accept the alert popup

	}

}
