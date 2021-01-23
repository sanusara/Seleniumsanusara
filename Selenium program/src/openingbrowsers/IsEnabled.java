package openingbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\webdriver\\\\\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.bigbasket.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 
		 driver.findElement(By.linkText("Login")).click();
		 
		 
		 WebElement login= driver.findElement(By.xpath("//button[@style='margin-top: 20px']"));
		 Boolean value= login.isEnabled();
		 System.out.println("Login works:"+value );
		 
		 driver.findElement(By.id("otpEmail")).sendKeys("9045646778");
		 value=login.isEnabled();
		 System.out.println("Login works:" +value);

	}

}
