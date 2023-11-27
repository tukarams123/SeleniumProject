package TestNG_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex_7_TestNG_Annotations {
	@Test
	public void test1()
	{
		Reporter.log("Test Case 1",true);
	}
	
	@Test
	public void test2()
	{
		Reporter.log("Test Case 2",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Before method",true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("After method",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("Before class",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("After class",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("Before test",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("After test",true );
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("Before Suite",true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("After Suite",true);
	}

}
