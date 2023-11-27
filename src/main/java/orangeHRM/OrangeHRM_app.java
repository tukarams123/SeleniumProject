package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_app {
	WebDriver driver = new ChromeDriver();
	public void openApp() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	public void login() throws InterruptedException {
		String userName = driver.findElement(By.xpath("//p[text()='Username : Admin']")).getText();
		System.out.println(userName);	
		String[] un=userName.split(":");
		System.out.println(un[1]);
		String username=un[1].trim();
		System.out.println(username);
		
		String pass=driver.findElement(By.xpath("//p[text()='Password : admin123']")).getText();
		System.out.println(pass);
		String[] pw=pass.split(":");
		System.out.println(pw[1]);
		String passWord=pw[1].trim();
		System.out.println(passWord);
	
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//button[text()=' Login '] ")).click();
		Thread.sleep(4000);

	}
	
	public void logout() throws InterruptedException {
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		OrangeHRM_app app=new OrangeHRM_app();
		app.openApp();
		app.login();
		app.logout();
		//app.userName();
		//app.password();
	}

}
