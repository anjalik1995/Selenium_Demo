import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		WebDriverWait ww=new WebDriverWait(driver, 10);
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.name("did_submit")).isEnabled();
			}
			
		});
		
		driver.findElement(By.id("identify_email")).sendKeys("8767456789");
		
		Thread.sleep(1000);
		
		driver.close();

}
}
