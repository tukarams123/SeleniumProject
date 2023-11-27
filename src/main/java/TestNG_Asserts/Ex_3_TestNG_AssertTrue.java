package TestNG_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_3_TestNG_AssertTrue {
	@Test
	public void TC1() {
		boolean actResult = false;
		Assert.assertTrue(actResult, "Failed: actual result is false: ");

	}

}
