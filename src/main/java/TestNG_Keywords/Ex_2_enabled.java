package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

//This keyword is used to skip some of the test cases using value "false"
public class Ex_2_enabled {
	
	@Test
	public void testCase1()
	{
		Reporter.log("Executing test1",true);
	}
	
	@Test(enabled = true) 
	public void testCase2()
	{
		Reporter.log("Executing test2",true);
	}
	
	@Test(enabled = false)  //skip this test
	public void testCase3()
	{
		Reporter.log("Executing test3",true);
	}

}
