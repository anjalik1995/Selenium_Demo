import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrc {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.quit();
	}

}