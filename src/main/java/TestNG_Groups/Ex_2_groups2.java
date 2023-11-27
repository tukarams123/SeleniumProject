package TestNG_Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_2_groups2 {
	@Test(groups = "profile")
	public void TC6() {
		Reporter.log("Running TC6", true);
	}

	@Test(groups = "setting")
	public void TC7() {
		Reporter.log("Running TC7", true);
	}

	@Test(groups = "profile")
	public void TC8() {
		Reporter.log("Running TC8", true);
	}

}
