import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisplayedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		Thread.sleep(2000);
		
		WebElement search=driver.findElement(By.name("q"));
		System.out.println(search.isDisplayed());
		search.sendKeys("java",Keys.ENTER);
		
		WebDriverWait ww=new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.titleContains("java"));
		driver.findElement(By.xpath("//a[contains(.,'Sign in')]")).click();

}
}
