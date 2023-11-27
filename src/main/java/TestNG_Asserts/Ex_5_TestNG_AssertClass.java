package TestNG_Asserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

//In Assert class if the test case have two conditions and if both are false
//then it will only going to the first condition if it is false
//then it will not going to the next condition
public class Ex_5_TestNG_AssertClass {
	@Test
	public void TC1() {
		String actResult = "somnath";
		String expResult = "somnat";

		Assert.assertEquals(actResult, expResult, "Failed:Results are different: ");

		boolean actResult2 = false;
		Assert.assertTrue(actResult2, "Failed: actual result is false: ");
	}
	@Test
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}

}
