import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		// Thread.sleep(4000);

		String parenthandel = driver.getWindowHandle();
		System.out.println(parenthandel );
		Thread.sleep(4000);

		Set<String> windowhandels = driver.getWindowHandles();
		// System.out.println(windowhandels);
		windowhandels.remove(parenthandel);
		for (String wind : windowhandels) {
			System.out.println(wind );
			driver.switchTo().window(wind).close();//method channing because return type of window is webdriver
		}

	}

}
