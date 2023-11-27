package webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandlingRahulShettySite {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Row size from table
		int rowSize = d.findElements(By.xpath("//table[@name='courses']//tr")).size();
		System.out.println("Row size: " + rowSize);

		// Column size from single row
		int colSize = d.findElements(By.xpath("//table[@name='courses']//tr[2]/td")).size();
		System.out.println("Column size from row: " + colSize);

		// Column size from table
		int colSizeFromTable = d.findElements(By.xpath("//table[@name='courses']//tr/th")).size();
		System.out.println("Column size from table: " + colSizeFromTable);

		// Printing table headings
		List<WebElement> headings = d.findElements(By.xpath("//table[@name='courses']//tr/th"));
		System.out.println("---Headings of table---");
		for (WebElement heading : headings) {
			String one = heading.getText();
			System.out.println(one);
		}

		// Get data from particular row
		String data = d.findElement(By.xpath("//table[@name='courses']//tr[4]/td[2]")).getText();
		System.out.println("Second data from 4th row: " + data);

		// Get all the prices from table
		List<WebElement> allPrices = d.findElements(By.xpath("//table[@name='courses']//td[3]"));
		int size = allPrices.size();
		System.out.println("Count of prices: " + size);
		System.out.println("---All prices---");
		for (WebElement price : allPrices) {
			String text = price.getText();
			System.out.println(text);
		}	
		//	Get all the names of Courses
		List<WebElement> allCourses = d.findElements(By.xpath("//table[@name='courses']//td[2]"));
		int size2=allCourses.size();
		System.out.println("Count of courses: "+size2);
		System.out.println("---All Courses---");
		for(WebElement course:allCourses)
		{
			String courseName=course.getText();
			System.out.println(courseName);
		}
		}

	}


