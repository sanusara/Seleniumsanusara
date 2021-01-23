package openingbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		
		driver.get("https://www.gmail.com/");
		driver.findElement(By.name("identifier")).sendKeys("saranyaprakash557@gmail.com");
		
		
		

	}

}
