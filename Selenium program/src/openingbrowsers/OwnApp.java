package openingbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwnApp {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://testhing.com/academy/demo/webelements/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.className("inputs")).sendKeys("Saranya");
		//System.out.println(driver.getPageSource());
		
		//Radio button and is selected method.
		
		WebElement BMW=driver.findElement(By.id("bmwradio"));
		BMW.click();
		System.out.println("Verify BMW button:" +BMW.isSelected());
		
		WebElement  Benz=driver.findElement(By.id("benzradio"));
		Benz.click();
		System.out.println("Verify Benz button: " +Benz.isSelected());
		System.out.println("Verify BMW button:" +BMW.isSelected());
		
		WebElement  Honda=driver.findElement(By.id("hondaradio"));
		Honda.click();
		System.out.println("Verify Honda button: " +Honda.isSelected());
		System.out.println("Verify Benz button:" +Benz.isSelected());
		
		WebElement Bmwcheck=driver.findElement(By.id("bmwcheck"));
		Bmwcheck.click();
		WebElement Benzcheck=driver.findElement(By.id("benzcheck"));
		Benzcheck.click();
		WebElement Hondacheck=driver.findElement(By.id("hondacheck"));
		Hondacheck.click();
		System.out.println("Verify Bmwcheck: " +Bmwcheck.isSelected());
		System.out.println("Verify Benzcheck: " +Benzcheck.isSelected());
		System.out.println("Verify Hondacheck: " +Hondacheck.isSelected());
		
		
		
		
		
		
		

	}

}
