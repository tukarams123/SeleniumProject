package screenshots;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotJiraBoard {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://man12.atlassian.net/jira/software/projects/PROJ/boards/1?selectedIssue=PROJ-6");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest=new File("E:\\photos\\jira.jpg");
		Files.copy(src, dest);
		System.out.println(dest);
		
		

	}

}
