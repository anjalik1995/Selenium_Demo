
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		WebElement searchbox=driver.findElement(By.name("username"));
		searchbox.sendKeys("admin");
		
		Thread.sleep(1000);

		WebElement searchbox1=driver.findElement(By.name("pwd"));
		searchbox1.sendKeys("manager");
		
		WebElement Login=driver.findElement(By.id("loginButton"));
		Login.click();
		
		Thread.sleep(4000);
		
		WebElement logout1=driver.findElement(By.id("logoutLink"));
		System.out.println(logout1.getText());         //gettext method is used for inner text
		logout1.click();
		
}
}
