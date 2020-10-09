//select birthdate dropdown with the help of select class

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDemo {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
         Thread.sleep(2000);
        WebElement day = driver.findElement(By.id("day"));
        
        Select dy=new Select(day);             
        
          dy.selectByIndex(24);
        //dy.selectByValue("24");
        //dy.selectByVisibleText("24");
        
        WebElement month = driver.findElement(By.id("month"));
        Select mn=new Select(month);
        mn.selectByIndex(11);
        List<WebElement> mon=mn.getOptions();
        
        for (WebElement months : mon) {
        	System.out.println(months.getText());
			
		}
       // mn.selectByValue("11");
        
        WebElement year=driver.findElement(By.id("year"));
        Select yr=new Select(year);
        yr.selectByValue("1995");

}
}