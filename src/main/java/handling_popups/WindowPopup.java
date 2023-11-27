package handling_popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://skpatro.github.io/demo/links/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// click on New Tab
		d.findElement(By.xpath("//input[@name='NewTab']")).click();

		// to perform actions on child window we have to switch our control from main
		// window to child window by using window id
		// get window id of all the windows
		Set<String> ids = d.getWindowHandles();

		// converting Set to Arraylist to get the individual id of all the windows
		ArrayList<String> a1 = new ArrayList<String>(ids);

		// get the individual id of main window by using get() method
		String mainWindow = a1.get(0);

		// get the individual id of child window by using get() method
		String childWindow = a1.get(1);

		// switch control from main window to child window by using child window id
		d.switchTo().window(childWindow);

		// peroforming actions on child window
		d.findElement(By.xpath("//span[text()='Training']")).click();
		
		// switch control from child window to main window by using main window id
		d.switchTo().window(mainWindow);
		
		// peroforming actions on main window
		d.findElement(By.xpath("(//input[@class='btn'])[2]")).click();



	}

}
