package Framework;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_2WithoutDDF {

	public static void main(String[] args) throws FileNotFoundException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/v1/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// enter username
		d.findElement(By.id("user-name")).sendKeys("standard_user");

		// enter password
		d.findElement(By.id("password")).sendKeys("secret_sauce");

		// click on Login button
		d.findElement(By.className("btn_action")).click();

		String actTitle = d.getTitle();
		String expTitle = "Swag Labs";

		if (actTitle.equals(expTitle)) {
			System.out.println("Test Case is pass");
		} else {
			System.out.println("Test Case is fail");

		}

	}

}
