package TestNG_Asserts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//In Assert class if the test case have two conditions and if both are false
//then it will only going to the first condition if it is false
//then it will not going to the next condition
//to overcome this we will use SoftAssert class
//it will go through all the conditions
//whether it is false or true
public class Ex_6_TestNG_SoftAssertClass {
	@Test
	public void TC1() {
		SoftAssert s = new SoftAssert();
		String actResult = "somnath";
		String expResult = "somnat";

		s.assertEquals(actResult, expResult, "Failed:Results are different: ");
		Reporter.log("Running TC1", true);

		boolean actResult2 = false;
		s.assertTrue(actResult2, "Failed: actual result is false: ");

		s.assertAll();
	}

	@Test
	public void TC2() {
		Reporter.log("Running TC2", true);
	}

}
