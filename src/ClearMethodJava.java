import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethodJava {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Java",Keys.ENTER);
		
		driver.findElement(By.name("q")).clear();           //clear the text in searchbox
		
		driver.findElement(By.name("q")).sendKeys("Aagra",Keys.ENTER);
		Thread.sleep(1000);
		
		driver.close();
		


}
}
