package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/v1/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		SwagLabsLoginPage login = new SwagLabsLoginPage(d);  //basic/early initialization
		login.inpSwagLabsLoginPageUN();    //late/lazy initialization
		Thread.sleep(1000);
		login.inpSwagLabsLoginPagePwd();
		Thread.sleep(1000);
		login.clickSwagLabsLoginPageLoginBtn();
		Thread.sleep(1000);
		
		SwagLabsHomePage home=new SwagLabsHomePage(d);
		home.verifySwagLabsHomePageTitle();  
		Thread.sleep(1000);
		home.clickSwagLabsHomePageMenuBtn();
				

		SwagLabsMenuPage menu = new SwagLabsMenuPage(d);
		Thread.sleep(1000);
		menu.clickSwagLabsMenuPageLogoutBtn();

	}

}
