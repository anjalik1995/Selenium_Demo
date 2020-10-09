//load actitime.login
//login thr username and password
//click on question mark
//then under this click on about your actitime
//print actitime 2020 online

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActitimeAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		//searchbox.sendKeys("admin");
		
		Thread.sleep(1000);

		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(4000);
		
		WebElement ele=driver.findElement(By.xpath("//div[@class=\'popup_menu_button popup_menu_button_support\']"));

		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		ele.click();
				
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.xpath("//span[contains(.,'actiTIME 2020 Online')]")).getText());
		//Alert a1=driver.switchTo().alert();
		//System.out.println(a1.getText());
		//a1.accept();
		
		Thread.sleep(2000);
		driver.close();
		
		//driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]"));

}
}
