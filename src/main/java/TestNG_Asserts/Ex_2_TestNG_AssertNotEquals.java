package TestNG_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_2_TestNG_AssertNotEquals {
	@Test
	public void TC1() {
		String actResult = "somnath";
		String expResult = "somnath";

		Assert.assertNotEquals(actResult, expResult, "Failed: Results are same: ");
	}

}
