package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

//This keyword is depend upon the other method if that method executes successfully 
//then that time the method which is depend upon that method will be executes successfully
//if the other method gets failed the that time the method which is depend upon that method will be skipped
public class Ex_8_dependsOnMethods {

	@Test
	public void logIn()
	{
		Reporter.log("Login successful",true);
	}
	
//	@Test
//	public void logIn()
//	{
//		Reporter.log("Login successful",true)
//	}

	@Test(dependsOnMethods = { "logIn" })
	public void logOut() {
		Reporter.log("Logout successful", true);
	}

}
