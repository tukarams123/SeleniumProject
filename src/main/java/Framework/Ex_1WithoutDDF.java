package Framework;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex_1WithoutDDF {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.policybazaar.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// click on sign in button
		d.findElement(By.xpath("//a[text()='Sign in']")).click();

		// Enter mobile number
		d.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys("9834835403");

		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Sign in with Password'])[2]")));
		// Click on Sign in with password
		d.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();

		// Find the address of My Account
		WebElement myAcc = d.findElement(By.cssSelector("[class='userprofile']"));

		// Move the cursor on "My Account"
		Actions act = new Actions(d);
		act.moveToElement(myAcc).perform();

//		FluentWait f=new FluentWait(d);
//		f.withTimeout(Duration.ofSeconds(30));
//		f.pollingEvery(Duration.ofSeconds(5));
//		f.ignoring(NoSuchElementException.class);
//		f.until(ExpectedConditions.alertIsPresent());
//		// Click on "My Profile"
		d.findElement(By.xpath("//span[text()=' My profile '] ")).click();

		// Switch window to "My Profile" page
		Set<String> ids = d.getWindowHandles(); // mainPageId,childPageId
		Iterator<String> it = ids.iterator();
		String mainPageId = it.next();
		String childPageId = it.next();

		d.switchTo().window(childPageId);

		// Performing actions on child page
		// Compare name is correct or not
		String expText = "Somnath";
		String actText = d.findElement(By.cssSelector("[name='personName']")).getAttribute("value");

		if (actText.equals(expText)) {
			System.out.println("Test case is passed");
		} else {
			System.out.println("Test case is failed");
		}

		// Switch window to main page
		d.switchTo().window(mainPageId);

		// Move the cursor on "My Account"
		act.moveToElement(myAcc).perform();

		// Click on "Sign Out"
		d.findElement(By.xpath("//span[text()='Sign out'] ")).click();

	}

}
