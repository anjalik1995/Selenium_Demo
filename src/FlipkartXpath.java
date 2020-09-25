import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("iphone",Keys.ENTER);
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//img[@alt='Apple iPhone SE (White, 64 GB)']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		
		Set<String>tabs=driver.getWindowHandles();
		
		for (String tab : tabs) {
			driver.switchTo().window(tab);
			
		}
		
		//System.out.println(sale.getText());
		
		//driver.findElement(By.id("search")).sendKeys(sale.getText());
				
	    			
	}
}
