import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchList {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
         Thread.sleep(2000);
        
        WebElement month = driver.findElement(By.id("month"));
        Select mn=new Select(month);
       // mn.selectByIndex(11);
        List<WebElement> mon=mn.getOptions();
         Set<String> set=new TreeSet<String>();            //sorting
        
           for (WebElement months : mon) {
        	System.out.println(months.getText());
        	set.add(months.getText());
        	if(months.getText().equalsIgnoreCase("May"));         //serach and select
        	mn.selectByVisibleText("May");
           }
           System.out.println("=======================");
           for (String months : set) {
        	   System.out.println(months);
			
		}
			
		}

}
