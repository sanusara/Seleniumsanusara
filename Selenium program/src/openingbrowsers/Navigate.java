package openingbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\webdriver\\\\\\\\\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://testhing.com/academy/demo/webelements/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		WebElement login= driver.findElement(By.id("name"));
		login.sendKeys("Saranya");
		login.clear();
		login.sendKeys("Santosh");
		
		String title= driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://testhing.com/contact-us/");
		String currenttitle= driver.getCurrentUrl();
	
		System.out.println(currenttitle);
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
		

	}

}
