package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String windowid=driver.getWindowHandle();
		System.out.println(windowid); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'address ')]")).sendKeys("abc");
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'mobile number to')]")).getText());
		
		Dimension d=driver.manage().window().getSize();
		int height=d.getHeight();
		int width=d.getWidth();
		System.out.println("height of the window:"+height);
		System.out.println("width of the window:"+width);
		driver.manage().window().minimize();	
		
		Point p=driver.manage().window().getPosition();
		int x=p.getX();
		int y=p.getY();
		System.out.println("x-axis position:"+x);
		System.out.println("y-axis position:"+y); 
			

	}

}
