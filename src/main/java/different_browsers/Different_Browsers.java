package different_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Different_Browsers {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("www.google.com");
	}

}
