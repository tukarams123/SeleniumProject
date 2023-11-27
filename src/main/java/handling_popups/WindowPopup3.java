package handling_popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup3 {
	WebDriver d = new ChromeDriver();

	public void windowHandle() throws InterruptedException {
		d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		d.switchTo().frame("iframeResult");
		d.findElement(By.linkText("Visit W3Schools.com!")).click();

		Set<String> ids = d.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String mainPage = it.next();
		String childPage = it.next();

		d.switchTo().window(childPage);
		Thread.sleep(3000);
		d.findElement(By.linkText("MYSQL")).click();

		d.switchTo().window(mainPage);
		d.findElement(By.xpath("//a[@id='menuButton']")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		WindowPopup3 w3=new WindowPopup3();
		w3.windowHandle();
	}

}
