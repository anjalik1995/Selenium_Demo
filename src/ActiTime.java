import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("actiTIME Inc.")).click(); //linktest pass full link and partiallinktext pass partial link i.e acttime
		
		//it is used for to get title of another tab or link
		Set<String> tabs=driver.getWindowHandles();
		
		for (String tab : tabs)
		{
			driver.switchTo().window(tab);
		}
		System.out.println(driver.getTitle());
		
	}
}