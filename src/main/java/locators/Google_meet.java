package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Google_meet {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://apps.google.com/meet/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-geolocation");
		
		//driver.findElement(By.className("glue-header__link ")).click();
		WebElement sign_in=driver.findElement(By.linkText( "साइन इन करना"));
		sign_in.click();
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("tukaramshinde1516@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:/photos/GoogleMeet.png");
		Files.copy(src, dest);
		
//		WebElement next=driver.findElement(By.className("VfPpkd-vQzf8d"));
//		Actions action= new Actions(driver);
//		action.moveToElement(next).click();

		
//		driver.findElement(By.xpath("//div[@jsname='uZWyed']")).getText();
//		driver.findElement(By.xpath("//div[@jsname='uZWyed']")).getAttribute("uZWyed");
//		driver.findElement(By.xpath("//div[@jsname='uZWyed']")).getTagName();

	}

}
