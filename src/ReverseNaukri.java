import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseNaukri {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		String parenthandel = driver.getWindowHandle();
		System.out.println(parenthandel + "p");
		Thread.sleep(4000);
		Set<String> allWindoHandel = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(allWindoHandel);
		System.out.println(lst.size());
		for (int i = lst.size() - 1; i >= 0; i--) {
			System.out.println(lst.get(i) + "c");
			driver.switchTo().window(lst.get(i));
			driver.close();
			Thread.sleep(2000);
		}
//done 
	}
}
