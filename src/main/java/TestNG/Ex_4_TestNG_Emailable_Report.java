package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_4_TestNG_Emailable_Report {
	
	@Test
	public void TC1()
	{
		Reporter.log("Running TC1",true); //Printing in both console + emailable report
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running TC2",true);  //Printing in both console + emailable report
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("Running TC3"); //printing in only emailable report
	}
	
	@Test
	public void TC4()
	{
		Reporter.log("Running TC4",false); //printing in only emailable report
	}

}
