package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFromFrameToMainPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		d.manage().window().maximize();

		Thread.sleep(3000);
		d.switchTo().frame("iframeResult"); // frame(frame name);
		// d.switchTo().frame("iframeResult"); //frame(frame id);
		//d.switchTo().frame(0);  //frame(frame index);
		//d.switchTo(WebElement value)
		
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		//d.switchTo().parentFrame();
		d.switchTo().defaultContent();
		
		Thread.sleep(3000);
		d.findElement(By.id("menuButton")).click();


	}

}
