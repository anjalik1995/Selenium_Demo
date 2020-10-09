import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class AlertPopupAssign {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v1/index.php");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(4000);
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		
		driver.close();
	}

}
