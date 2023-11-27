package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScript2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement facebook = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", facebook);
		Thread.sleep(3000);
		String domain=js.executeScript("return document.domain;").toString();
		System.out.println(domain);
		
		String url=js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		js.executeScript("window.location='https://www.facebook.com/'");
		
		Thread.sleep(3000);
		js.executeScript("alert('Welcome to facebook')");

		

	}

}
