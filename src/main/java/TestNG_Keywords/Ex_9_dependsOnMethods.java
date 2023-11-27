package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

//This keyword is depend upon the other method if that method executes successfully 
//then that time the method which is depend upon that method will be executes successfully
//if the other method gets failed the that time the method which is depend upon that method will be skipped
//if one method is depends upon the two methods then if one of the methods gets failed from that two methods
//the method depends upon that two methods will be skipped
public class Ex_9_dependsOnMethods {

	@Test
	public void logIn1()
	{
		Reporter.log("Login1 successful",true);
	}
	
	@Test(dependsOnMethods = {"logIn1"})
	public void logIn2()
	{
		Reporter.log("Login2 successful",true);
	}

	@Test(dependsOnMethods = { "logIn1","logIn2" })
	public void logOut() {
		Reporter.log("Logout successful", true);
	}

}
