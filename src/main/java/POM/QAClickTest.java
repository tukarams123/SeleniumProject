package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAClickTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		QAClickHomePage home=new QAClickHomePage(driver);
		Thread.sleep(2000);
		home.clickQAClickHomePageCourses();
		Thread.sleep(2000);

		QAClickCoursesPage courses=new QAClickCoursesPage(driver);
		Thread.sleep(2000);
		courses.clickQAClickCoursesPageSignUp();
		Thread.sleep(2000);
		
		QAClickSignUpPage sign=new QAClickSignUpPage(driver);
		sign.inpQAClickSignUpPageFullName();
		Thread.sleep(2000);
		sign.inpQAClickSignUpPageEmail();
		Thread.sleep(2000);
		sign.inpQAClickSignUpPagePassWord();
		Thread.sleep(2000);
		sign.clickQAClickSignUpPageSignUp();

	}

}
