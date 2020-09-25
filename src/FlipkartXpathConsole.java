import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpathConsole {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	Thread.sleep(2000);
	
	List<WebElement> menues =driver.findElements(By.xpath("//div[@class='_1OSP27']/span"));
	
	for (WebElement menu : menues) 
	{
		
		System.out.println(menu.getText());
		
	}
}
}
