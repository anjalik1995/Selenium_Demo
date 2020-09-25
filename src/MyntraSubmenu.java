import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraSubmenu {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	Thread.sleep(10000);
	
	List<WebElement> menues =driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
	
	Thread.sleep(1000);
	Actions a= new Actions(driver);
	
	for (WebElement menu : menues) 
	{
		
		String name=menu.getText();
		System.err.println(name);
		
		a.moveToElement(menu).build().perform();
		Thread.sleep(2000);
		
		List<WebElement> submenues=driver.findElements(By.xpath("//a[@class='desktop-main']/parent::div/descendant::ul"));
		
		for (WebElement submenuesName : submenues) {
			System.out.println(submenuesName.getText());
			
		}
	}
}
}