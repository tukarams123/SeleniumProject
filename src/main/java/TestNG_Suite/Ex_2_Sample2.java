package TestNG_Suite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_2_Sample2 {

	@Test
	public void TC4() {
		Reporter.log("Running TC4", true);
	}

	@Test
	public void TC5() {
		Reporter.log("Running TC5", true);
	}

	@Test
	public void TC6() {
		Reporter.log("Running TC6", true);
	}

}
