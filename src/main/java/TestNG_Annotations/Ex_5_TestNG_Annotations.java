package TestNG_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex_5_TestNG_Annotations {
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("---open browser---",true);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("---login to app---",true);
	}
	
	@Test
	public void verifyTitle1()
	{
		Reporter.log("---Verifying title1 TC---",true);
	}
	
	@Test
	public void verifyTitle2()
	{
		Reporter.log("---Verifying title2 TC---",true);
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("---logout from app---",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("---close browser---",true);
	}
	
	

}
