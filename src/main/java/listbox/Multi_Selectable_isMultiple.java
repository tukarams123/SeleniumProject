package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selectable_isMultiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.id("multiselect1"));
		Select car = new Select(drop);
		car.selectByVisibleText("Hyundai");
		car.selectByValue("audix");
		car.selectByIndex(0);
		
		Thread.sleep(2000);
		
		boolean cars=car.isMultiple();
		System.out.println("Are there multiple options selected?: "+cars);
		if(cars)
		{
			System.out.println("Multiple options are selected");
		}
		else
		{
			System.out.println("Multiple options are not selected");
		}
				
		String text=car.getFirstSelectedOption().getText();
		System.out.println("First selected option from list: "+text);
		
		List<WebElement> list=car.getAllSelectedOptions();
    	System.out.println("All selected options from list are:");
	    for(WebElement s:list)
	    {
	    	System.out.println(s.getText());
	    }
	    
	    List<WebElement> l = car.getOptions();
	    int size=l.size();
	    System.out.println("Size of the list: "+size);
    	System.out.println("All options from list are:");
	    for(WebElement L:l)
	    {
	    	System.out.println(L.getText());
	    }
		//car.deselectAll();
		//car.deselectByVisibleText("Hyundai");
		//car.deselectByValue("volvox");
		//car.deselectByIndex(3);
	}

}
