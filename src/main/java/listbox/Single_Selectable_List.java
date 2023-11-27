package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Selectable_List {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/"); 
		 Thread.sleep(2000);
		 driver.manage().window().maximize(); Thread.sleep(2000);
		 driver.findElement(By.linkText("Create new account")).click();
		 Thread.sleep(2000); 
		 WebElement birth_day = driver.findElement(By.name("birthday_day"));
		  
		 Select day=new Select(birth_day); 
		 day.selectByVisibleText("15");
		 //day.selectByValue("15"); 
		 //day.selectByIndex(14); 
		 Thread.sleep(2000);
		  
		 WebElement birth_month = driver.findElement(By.xpath("//select[@title='Month']")); 
		 Select month=new Select(birth_month); 
		 //month.selectByVisibleText("Jun");
		 month.selectByValue("6"); 
		 //month.selectByIndex(5); 
		 Thread.sleep(2000);
		  
		 WebElement birth_year = driver.findElement(By.id("year")); 
		 Select year=new Select(birth_year); 
		 //year.selectByVisibleText("1998");
		 //year.selectByValue("1998"); 
		 year.selectByIndex(25); 
		 Thread.sleep(2000);
		

		/*driver.navigate().to("file:///C:/Users/admin/Desktop/MultiSelectableDropdown.html");
		Thread.sleep(2000);
		WebElement multi = driver.findElement(By.xpath("//select[@id='123']"));
		Select sel = new Select(multi);
		sel.selectByVisibleText("Books");
		sel.selectByValue("3");

		Thread.sleep(2000);
		driver.navigate().to("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select car = new Select(drop);
		car.selectByVisibleText("Hyundai");
		car.selectByValue("audix");
		car.selectByIndex(0);
		
		Thread.sleep(2000);
		//car.deselectAll();
		//car.deselectByVisibleText("Hyundai");
		car.deselectByValue("volvox");
		car.deselectByIndex(3);*/


	}

}
