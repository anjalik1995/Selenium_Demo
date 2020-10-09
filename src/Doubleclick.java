import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://demo.guru99.com/test/simple_context_menu.html");
         Thread.sleep(2000);
         WebElement click=driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
        Actions a=new Actions(driver);
        a.doubleClick(click).build().perform();

}
}
