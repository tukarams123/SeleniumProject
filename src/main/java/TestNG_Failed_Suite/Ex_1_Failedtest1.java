package TestNG_Failed_Suite;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ex_1_Failedtest1 {
	@Test
	public void TC1() {
		String expResult = "Shyam";
		String actResult = "Akash";

		Assert.assertEquals(expResult, actResult, "Failed: Results are not same");
	}

	@Test
	public void TC2() {
		SoftAssert soft = new SoftAssert();
		boolean result = true;
		soft.assertFalse(result);
		soft.assertAll();

	}

	@Test
	public void TC3() {
		boolean result = false;
		Assert.assertTrue(result);
	}

}
