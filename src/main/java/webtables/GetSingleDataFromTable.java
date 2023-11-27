package webtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSingleDataFromTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/admin/Desktop/Webtable.html");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement  data= d.findElement(By.xpath("//table[@id='678']//tr[3]/td[2]"));
		String text=data.getText();
		System.out.println("Data: " + text);

	}

}
