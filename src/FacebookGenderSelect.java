import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookGenderSelect {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
         Thread.sleep(2000);
         
        WebElement female = driver.findElement(By.xpath("//label[contains(.,'Female')]"));
        female.click();
        Thread.sleep(4000);
        WebElement ele=driver.findElement(By.xpath("//input[@name=\"sex\" and @value=\"1\" ]"));
        System.out.println(female.isSelected());
        System.err.println(ele.getAttribute("class"));
        System.out.println(driver.findElement(By.tagName("title")).getAttribute("textContent"));
        
        Thread.sleep(1000);
         
         driver.close();
	}

}
