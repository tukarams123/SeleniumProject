package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_6_priorityDuplicate {

	// If the multiple test have same priority then that time tests are executed
	// based on the alphabetical order

	@Test(priority = 3)
	public void test1() {
		Reporter.log("Running test1", true);
	}

	@Test(priority = 3)
	public void test3() {
		Reporter.log("Running test3", true);
	}

	@Test(priority = 3)
	public void test2() {
		Reporter.log("Running test2", true);
	}

	@Test(priority = 3)
	public void test4() {
		Reporter.log("Running test4", true);
	}
}
