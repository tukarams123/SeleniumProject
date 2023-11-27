package listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Selectable_isMultiple {

	public static <T> void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement birth_month = driver.findElement(By.name("birthday_month"));
		
		Select month=new Select(birth_month);
		month.selectByIndex(5);
		
		
		boolean b=month.isMultiple();
		System.out.println(b);
		System.out.println("--First selected option from list--");
		String text=month.getFirstSelectedOption().getText();
		System.out.println(text);
		
		System.out.println("--All selected option from list--");
		List<WebElement> list=month.getAllSelectedOptions();
		for(WebElement s:list)
		{
			System.out.println(s.getText());
		}
		
		System.out.println("--All options from list--");
		List<WebElement> allOptions=month.getOptions();
		int size=allOptions.size();
		System.out.println("Size of the list: "+size);
		
		for(WebElement all:allOptions)
		{
			System.out.println(all.getText());
		}
		
		TreeSet<String> tr=new TreeSet<String>();
		for(WebElement e:allOptions)
		{
			tr.add(e.getText());
		}
		System.out.println("--All options in ascending order--");
		for(Object s1:tr)
		{
			System.out.println(s1);
		}
//		System.out.println(tr);

	
	}

}
