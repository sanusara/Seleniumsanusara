package openingbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBigbasket {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "C:\\\\webdriver\\\\IEDriverServer.exe");
		driver = new 	InternetExplorerDriver();
		
		
		
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("input")).sendKeys("Lakme");
	}

}
