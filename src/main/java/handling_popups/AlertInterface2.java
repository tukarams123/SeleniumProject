package handling_popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInterface2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.findElement(By.linkText("Alert with OK & Cancel")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//button[contains(text(),'click the button')])[2]")).click();
		
		Alert alt = d.switchTo().alert();
		String text=alt.getText();
		System.out.println(text);
		Thread.sleep(1000);
		//alt.accept();
		alt.dismiss();
		Thread.sleep(2000);
		d.findElement(By.linkText("Alert with Textbox")).click();
		Thread.sleep(2000); 
		d.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate')]")).click();
		
		Alert alt2=d.switchTo().alert();
		alt2.sendKeys("somnath shinde");
		Thread.sleep(2000); 
		String text2=alt2.getText();
		System.out.println(text2);
		Thread.sleep(2000); 
		alt2.accept();

		
		


	}

}
