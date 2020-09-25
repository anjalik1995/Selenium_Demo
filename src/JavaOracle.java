import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaOracle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		
		Thread.sleep(2000);
		
		List<WebElement> menues=driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		
         Thread.sleep(1000);
		
		
		for (WebElement sugg : menues) {
			
			System.out.println(sugg.getText());
	}
		 menues.get(0).click();
		// Actions a=new Actions(driver);
		 
		// WebElement Maps=driver.findElement(By.xpath("//a[contains(.,'Maps')]"));
		  
		// a.contextClick(Maps).perform();

}
}