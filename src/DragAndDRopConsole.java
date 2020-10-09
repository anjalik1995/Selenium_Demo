import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDRopConsole {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://jqueryui.com/droppable/");
         
         WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
         driver.switchTo().frame(frame);
         WebElement draggable = driver.findElement(By.id("draggable"));
         WebElement droppable = driver.findElement(By.id("droppable"));
         Actions a=new Actions(driver);
         a.dragAndDrop(draggable, droppable).perform();
         Thread.sleep(2000);
         System.out.println(droppable.getText());
         
	}
}
