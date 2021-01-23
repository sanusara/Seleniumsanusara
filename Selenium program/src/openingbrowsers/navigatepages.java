package openingbrowsers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatepages {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\webdriver\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://testhing.com/academy/demo/webelements/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("name")).sendKeys("Saranya");
		driver.findElement(By.id("openwindow")).click();
		String Homehandle=driver.getWindowHandle();
		System.out.println(Homehandle);
		
		Set <String> allHandles=driver.getWindowHandles();
		System.out.println(allHandles);
		
		for(String everyHandle:allHandles) {
			
			System.out.println(everyHandle);
			
			if(!everyHandle.equals(Homehandle)){
				
				driver.switchTo().window(everyHandle);
				driver.findElement(By.id("schedule-demo")).click();
				
				
				
			}
			
			
		}
		
		
		
		

	}

}
