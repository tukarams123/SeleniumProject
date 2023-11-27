package customized_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCustomizedListbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/"); 
		 Thread.sleep(2000);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize(); 
		 //Thread.sleep(2000);
		 driver.findElement(By.linkText("Create new account")).click();
		 //Thread.sleep(2000); 
		 
		 WebElement birth_month = driver.findElement(By.xpath("//select[@title='Month']")); 
		 birth_month.click();
		 Thread.sleep(3000);
		 birth_month.sendKeys(Keys.ARROW_UP);
		 Thread.sleep(3000);

		 birth_month.sendKeys(Keys.ENTER);

//		 Actions act=new Actions(driver); 
//		 birth_month.click();
//		 act.click(birth_month).perform();
//		 Thread.sleep(2000); 
//		 act.sendKeys(Keys.ARROW_UP).perform();
//		 Thread.sleep(2000); 
//		 act.sendKeys(Keys.ARROW_DOWN).perform();
//		 Thread.sleep(2000); 
//		 act.sendKeys(Keys.ARROW_DOWN).perform();
//		 Thread.sleep(2000); 
//		 act.sendKeys(Keys.ENTER).perform();
//		
		

	}

}
