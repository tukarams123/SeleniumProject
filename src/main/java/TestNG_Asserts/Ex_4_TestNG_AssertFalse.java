package TestNG_Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_4_TestNG_AssertFalse {
	@Test
	public void TC1() {
		boolean actResult = true;
		Assert.assertFalse(actResult, "Failed: actual result is true: ");
	

	}

}
