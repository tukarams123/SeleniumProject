package TestNG;

import org.testng.annotations.Test;

public class Ex_3_TestNG_Emailable_Report {
	@Test
	public void TC1() {
		System.out.println("Running TC1");  //printing only in console not in emailable report
	}

	@Test
	public void TC2() {
		System.out.println("Running TC2"); //printing only in console not in emailable report
	}

	@Test
	public void TC3() {
		System.out.println("Running TC2"); //printing only in console not in emailable report
	}

}
