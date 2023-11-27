package TestNG_ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_1_Parallel1 {
	
	@Test
	public void openFacebookApp() throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		d.get("www.facebook.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
	}

}
