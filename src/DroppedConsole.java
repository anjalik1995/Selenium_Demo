import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppedConsole {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://jqueryui.com/droppable/");
         
         WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
         driver.switchTo().frame(frame);
         Actions a=new Actions(driver);
         
         WebElement slider = driver.findElement(By.id("draggable"));
         a.dragAndDropBy(slider, 150, 0).perform();
         
         System.out.println(driver.findElement(By.id("droppable")).getText());
         
	}

}
