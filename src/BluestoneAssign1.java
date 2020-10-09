//open browser
//Enter url bluestone
//move to gold coins
//verify 20gm coin displaying or not
//incomplete

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BluestoneAssign1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/jewellery/diamond-rings.html");
		Thread.sleep(1000);
		
		WebElement coins=driver.findElement(By.xpath("//a[@title='Coins']"));
		
        Actions a=new Actions(driver);
		
		a.moveToElement(coins).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(.,'20 gram')]/parent::li[@class='active']")).click();
		

}
}
