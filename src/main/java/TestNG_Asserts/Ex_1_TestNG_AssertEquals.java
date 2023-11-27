package TestNG_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_1_TestNG_AssertEquals {
	@Test
	public void TC1() {
		String actResult = "somnath";
		String expResult = "somnath";

		Assert.assertEquals(actResult, expResult, "Failed:Results are different: ");
	}

}
