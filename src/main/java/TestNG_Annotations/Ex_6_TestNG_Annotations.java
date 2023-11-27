package TestNG_Annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex_6_TestNG_Annotations {
	WebDriver d=new ChromeDriver();
	
	@BeforeTest
	public void openApp()
	{
		 d.get("https://www.facebook.com/");
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void verifyHomePageTitle()
	{
		String actTitle=d.getTitle();
		System.out.println(actTitle);
		String expTitle="Facebook – log in or sign up";
		if(actTitle.equals(expTitle))
		{
			Reporter.log("Title is correct",true);
		}
		else
		{
			Reporter.log("Title is not correct",true);
		}
	}
	
	@AfterTest
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(3000);
		d.close();
	}

}
