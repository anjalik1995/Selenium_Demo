import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSubmenu {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		
		List<WebElement> menues =driver.findElements(By.xpath("//div[@class='_1OSP27']/span"));
		
		for (WebElement menu : menues) 
		{
			String name=menu.getText();
			System.out.println(name);
			
			a.moveToElement(menu).build().perform();
			
			List<WebElement> submenues=driver.findElements(By.xpath("//span[contains(.,'" +name+ "')]/parent::div/descendant::div[@class='_35d-dw']/a"));
			

			for (WebElement submenuesName : submenues) {
				System.out.println(submenuesName.getText());
				
			}
			
			//System.out.println(menu.getText());
			
		}
	}

}
