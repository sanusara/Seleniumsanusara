package openingbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbasket {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\webdriver\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("input")).sendKeys("Lakme");
		driver.findElement(By.xpath("//button[@ng-click='vm.userManualSearch()']")).click();
		//driver.findElement(By.className("ng-scope")).click();
		
		//driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.partialLinkText("Sign")).click();
		//driver.findElement(By.tagName("i")).click();

	}

}
