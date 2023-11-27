package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_7_timeOut {

	@Test(timeOut = 5000) // This test will be fail because we give timeout of 5 sec and we will wait for
							// 6 sec to running loop
	public void TC1() throws InterruptedException {
		Thread.sleep(6000);
		for (int i = 0; i <= 5; i++) {
			Reporter.log("Running TC1", true);
		}
	}

	@Test(timeOut = 2000)
	public void TC2() {
		for (int i = 0; i <=3; i++) {
			Reporter.log("Running TC2", true);
		}
	}

	@Test(timeOut = 2000)
	public void TC3() {
		Reporter.log("Running TC3", true);
	}

	@Test(timeOut = 2000)
	public void TC4() {
		Reporter.log("Running TC4", true);
	}

}
