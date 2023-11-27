package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
public void m1() throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.linkText("Create new account")).click();
//		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abc");
		//email
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("tukaramshinde1516@gmail.com");
		
		//password
		 
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("Aa1*Aa1*");
		
		//click()
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@class='x1i10hfl xjqpnuy xa49m3k xqeqjp1 x2hbi6w xdl72j9 x2lah0s xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x2lwn1j xeuugli x1hl2dhg xggy1nq x1ja2u2z x1t137rt x1q0g3np x1lku1pv x1a2a7pz x6s0dn4 xjyslct x1ejq31n xd10rxx x1sy0etr x17r0tee x9f619 x1ypdohk x1i0vuye x1f6kntn xwhw2v2 xl56j7k x17ydfre x2b8uid xlyipyv x87ps6o x14atkfc xcdnw81 xjbqb8w xm3z3ea x1x8b98j x131883w x16mih1h x972fbf xcfux6l x1qhh985 xm0m39n xt0psk2 xt7dq6l xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 x1n5bzlp x173jzuc x1yc6y37']")).click();

		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("tukaramshinde1516@gmail");

		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Aa1*Aa1*");


		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		




	}
public static void main(String[] args) throws InterruptedException {
	XpathByAttribute x=new XpathByAttribute();
	x.m1();
	
}

}
