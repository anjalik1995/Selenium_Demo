//copy and paste text in new tab

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotJavaSearch {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.google.com/");
         Thread.sleep(2000);
 		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
 		Thread.sleep(2000);
 		
 		WebElement dc = driver.findElement(By.xpath("//h2[@class='qrShPb kno-ecr-pt PZPZlf mfMhoc']//span[contains(.,'Java')]"));
 		Actions a=new Actions(driver);
 		a.doubleClick(dc).perform();
// 		Thread.sleep(2000);

 		
 		Robot r=new Robot();
 		Thread.sleep(2000);
 		
//		r.keyPress(KeyEvent.VK_CONTROL);
 		r.keyPress(KeyEvent.VK_COPY);
 		Thread.sleep(2000);
 		r.keyPress(KeyEvent.VK_T);
 		Thread.sleep(2000);
 		r.keyRelease(KeyEvent.VK_COPY);
 		r.keyRelease(KeyEvent.VK_T);
 		Thread.sleep(2000);
 		r.keyPress(KeyEvent.VK_PASTE);
 		Thread.sleep(2000);
 		r.keyRelease(KeyEvent.VK_PASTE);
 		//r.keyRelease(KeyEvent.VK_T);
 		r.keyRelease(KeyEvent.VK_CONTROL);


}
}
