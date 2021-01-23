package openingbrowsers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navE {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\webdriver\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://testhing.com/academy/demo/webelements/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		String homeHandle=driver.getWindowHandle();
		Thread.sleep(5000);
		System.out.println(homeHandle);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> allHandles=driver.getWindowHandles();
		System.out.println(allHandles);
		
		for(String handles:allHandles) {
			
			System.out.println(handles);
			
			if(!handles.equals(homeHandle)) {
				driver.switchTo().window(handles);
				driver.findElement(By.xpath("//img[@class='custom-logo']")).click();
				driver.close();
			}
			
			driver.switchTo().window(homeHandle);
			driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("Saranya");
		}

	}

}
