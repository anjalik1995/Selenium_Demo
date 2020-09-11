
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Java",Keys.ENTER);
		
		//WebElement Search=driver.findElement(By.id("btnk"));
		//Search.click();
	}
}