package openingbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\webdriver\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lakme");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		WebElement sg= driver.findElement(By.xpath("//img[@alt='Lakme Lip Love Chapstick, Spf15, Cherry, 4.5 g']"));
		sg.click();
		driver.navigate().to("https://www.amazon.in/Lakme-Lip-Love-Chapstick-Cherry/dp/B07HB28NFV/ref=sr_1_33?dchild=1&keywords=Lakme&qid=1597424973&sr=8-33");
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("+91 9035633672");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Hanuman04$");
		driver.findElement(By.id("signInSubmit")).click();


		
		

	}

}
