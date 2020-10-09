import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aspire/Desktop/sam.html");
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//input[@name='textA']"));
		ele.sendKeys("Name");
		
		WebDriverWait ww=new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.textToBePresentInElementValue(ele, "Name"));
		
		driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Anjali");

}
}
