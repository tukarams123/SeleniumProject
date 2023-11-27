package heroku_app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Heroku_app {
	WebDriver driver = new ChromeDriver();
    public void openHerokuApp() throws InterruptedException {
		
		driver.get("https://id.heroku.com/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
    }
    
//    public void signUp() throws InterruptedException {
//    	WebElement signup=driver.findElement(By.xpath("//span[text()='Sign Up']"));
//    	signup.click();
//    	
//		Thread.sleep(1000);
//
//    	WebElement firstName=driver.findElement(By.name("first_name"));
//    	firstName.sendKeys("Tukaram");
//    	
//		Thread.sleep(1000);
//
//    	WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last name']"));
//    	lastName.sendKeys("Shinde");
//    	
//		Thread.sleep(1000);
//    	
//    	WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
//    	email.sendKeys("tukaramshinde1516@gmail.com");
//    	
//		Thread.sleep(1000);
//
//    	WebElement company=driver.findElement(By.id("company"));
//    	company.sendKeys("Cognizant");
//    	
//		Thread.sleep(1000);
//
//		WebElement role=driver.findElement(By.id("role"));
//    	Select roles=new Select(role);
//    	roles.selectByIndex(3);
//
//		Thread.sleep(1000);
//
//    	WebElement country=driver.findElement(By.name("self_declared_country"));
//    	Select region=new Select(country);
//    	region.selectByVisibleText("India");
//    	
//		Thread.sleep(1000);
//
//    	WebElement language=driver.findElement(By.xpath("//select[@placeholder='Primary development language']"));
//    	Select lang=new Select(language);
//    	lang.selectByVisibleText("Java");
//    	
//		Thread.sleep(5000);
//		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@width='304']")));		
//		Thread.sleep(5000);
//
//		WebElement captcha=driver.findElement(By.className("recaptcha-checkbox-border"));
//		captcha.click();
//		driver.switchTo().defaultContent();
//		
//		Thread.sleep(1000);
//
//		WebElement create=driver.findElement(By.xpath("//input[@value='Create an Account']"));
//		create.click();
//
//    }
	
	public void login() throws InterruptedException {
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("tukaramshinde1516@gmail.com");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Aa2*Aa2*");
		
		WebElement login=driver.findElement(By.xpath("//button[text()='Log In']"));
		login.click();
		
		driver.findElement(By.name("commit")).click();	
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='slds-box slds-box_link slds-box_x-small slds-media slds-text-align_left container enabled'])[2]")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Heroku_app app=new Heroku_app();
		app.openHerokuApp();
		app.login();
		//app.signUp();
	}

}
