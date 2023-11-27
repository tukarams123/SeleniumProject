package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

//to execute the test case multiple times or repeatedly 
public class Ex_1_invocationCount {

	@Test(invocationCount = 2)  //executes 2 times 
	public void TC1() {
		Reporter.log("Running TC1", true);
	}

	@Test(invocationCount = 3)   //executes 3 times 
	public void TC2() {
		Reporter.log("Running TC2", true);
	}

	@Test(invocationCount = 4)   //executes 4 times 
	public void TC3() {
		Reporter.log("Running TC3", true);
	}

}
