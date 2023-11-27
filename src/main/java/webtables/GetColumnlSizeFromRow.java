package webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetColumnlSizeFromRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/admin/Desktop/Webtable.html");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> allColumns = d.findElements(By.xpath("//table[@id='678']//tr[2]/td"));
		int size = allColumns.size();
		System.out.println("Column size: " + size);

	}

}
