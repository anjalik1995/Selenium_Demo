import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SciteSwExe {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='file_wraper0']")).click();
		
		Runtime r=Runtime.getRuntime();
		Thread.sleep(4000);
		r.exec("C:\\Users\\Aspire\\Desktop\\html_selenium\\UploadSciteSelenium.exe");
		
		//Thread.sleep(4000);
		//driver.close();

}
}
