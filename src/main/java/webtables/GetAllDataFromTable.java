package webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllDataFromTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/admin/Desktop/Webtable.html");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> allData = d.findElements(By.xpath("//table[@id='678']//tr/td"));
		int size = allData.size();
		System.out.println("All data size: " + size);
		
		for(WebElement data:allData)
		{
			String one=data.getText();
			System.out.println(one);
		}

	}

}
