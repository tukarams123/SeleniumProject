package customized_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectMayMonthFromCustomizedListboxUsingEndKey {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/"); 
		 //Thread.sleep(2000);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize(); 
		 //Thread.sleep(2000);
		 driver.findElement(By.linkText("Create new account")).click();
		 //Thread.sleep(2000); 
		 
		 WebElement birth_month = driver.findElement(By.xpath("//select[@title='Month']")); 
		 
		 Actions act=new Actions(driver); 
		 act.click(birth_month).perform();
		 
		 //navigate to last option using "END" key
		 act.sendKeys(Keys.END).perform();
		 
		 for(int i=1;i<=7;i++)
		 {
			 act.sendKeys(Keys.ARROW_UP).perform();
			 Thread.sleep(1000);
		 }
		 act.sendKeys(Keys.ENTER).perform();
	}

}
