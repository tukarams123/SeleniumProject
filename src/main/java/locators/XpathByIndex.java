package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathByIndex extends XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);		
		driver.switchTo().window("360AB1E9EF5845660F537462E2804C44");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();		
		Thread.sleep(5000);
		WebElement firstName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstName.sendKeys("Somnath");
		Thread.sleep(1000);
		WebElement surName=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		surName.sendKeys("Shinde");
		Thread.sleep(1000);	
		WebElement mobile=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobile.sendKeys("98348351503");
		Thread.sleep(1000);	
		WebElement password=driver.findElement(By.id("password_step_input"));
		password.sendKeys("Aa1*Aa1*");
		Thread.sleep(1000);	

		WebElement birth_day=driver.findElement(By.name("birthday_day"));
		Select day=new Select(birth_day);
		day.selectByIndex(14);
		
		WebElement birth_month=driver.findElement(By.id("month"));
		Select month=new Select(birth_month);
		month.selectByValue("6");
		
		WebElement birth_year=driver.findElement(By.id("year"));
		Select year=new Select(birth_year);
		year.selectByValue("1998");
		
		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
	
		WebElement submit=driver.findElement(By.xpath("(//button[contains(@type,'submit')])[2]"));
		submit.click();
	

	}

}
