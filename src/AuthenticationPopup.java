import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	//	driver.get("http://the-internet.herokuapp.com/basic_auth"); //authentication popup
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");      //with username and password
		
		Thread.sleep(4000);
		driver.close();

	}

}
