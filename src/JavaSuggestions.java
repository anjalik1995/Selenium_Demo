import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSuggestions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("java");
		Thread.sleep(2000);
		
		List<WebElement> menues=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		Thread.sleep(1000);
		
		
		for (WebElement sugg : menues) {
			
			System.out.println(sugg.getText());
			
			//a.moveToElement(sugg).build().perform();
			
		}
         menues.get(2).click();
}
}