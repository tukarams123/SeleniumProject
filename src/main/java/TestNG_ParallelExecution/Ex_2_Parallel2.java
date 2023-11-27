package TestNG_ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_2_Parallel2 {
	
	@Test
	public void openGoogleApp() throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		d.get("www.google.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
	}

}
