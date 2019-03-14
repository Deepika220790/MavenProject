import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	WebDriver driver;
	public void launchBrowser() {
		String path=System.getProperty("user.dir")+"\\src\\main\\java\\Browser\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		 
	}
}
