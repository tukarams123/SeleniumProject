package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_4_priorityPositive {

	//If any test case have less priority that test will be executed first
	//less priority test cases--executed first
	
	@Test(priority = 3)
	public void test1()
	{
		Reporter.log("Running test1",true);
	}
	
	@Test(priority = 1)
	public void test3()
	{
		Reporter.log("Running test3",true);
	}
	
	@Test(priority = 4)
	public void test2()
	{
		Reporter.log("Running test2",true);
	}
	
	@Test(priority = 2)
	public void test4()
	{
		Reporter.log("Running test4",true);
	}
	
//	int num=5;
//	@Test(priority = num)  //priority can't be a variable
//	public void test5()
//	{
//		Reporter.log("Running test5",true);
//	}
//	
//	@Test(priority = 2.5)  //priority can't be a decimal value
//	public void test6()
//	{
//		Reporter.log("Running test6",true);
//	}
}
