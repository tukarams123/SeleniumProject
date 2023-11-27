package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_3_priorityDefault0 {
	
	//By default priority will be 0 for all the tests
	//And at that time tests will be executed in the alphabetical order
	
	@Test
	public void test3()
	{
		Reporter.log("Running test3",true);
	}
	
	@Test
	public void test4()
	{
		Reporter.log("Running test4",true);
	}
	
	@Test
	public void test1()
	{
		Reporter.log("Running test1",true);
	}
	
	@Test
	public void test2()
	{
		Reporter.log("Running test2",true);
	}
	
	

}
