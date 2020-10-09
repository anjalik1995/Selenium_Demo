import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityTextbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aspire/Desktop/HTML_Prog/VisibilityTextbox.html");
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		
		
		WebDriverWait ww=new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("Anjali");
		
		//driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1000);
		driver.close();

}
}
