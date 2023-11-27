package TestNG_Compatibility_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex_2_Multi_Browser {
	@Parameters("browserName")
	@Test
	public void openGoogleApp(String browserName) throws InterruptedException
	{
		WebDriver d=null;
		if(browserName.equals("chrome"))
		{
			 d=new ChromeDriver();
		}
		else if(browserName.equals("edge"))
		{
			 d=new EdgeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			 d=new FirefoxDriver();
		}
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.close();
	}

}
