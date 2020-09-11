import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Page {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		//String title=driver.getTitle();
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		//driver.get("https://www.google.com/");
		driver.close();
	}

}

