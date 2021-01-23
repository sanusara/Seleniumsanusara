package openingbrowsers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\webdriver\\\\\\\\\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://testhing.com/academy/demo/webelements/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebElement text= driver.findElement(By.id("displayed-text"));
		//text.sendKeys("Saranya");
		//Boolean vale=text.isDisplayed();
		//System.out.println(vale);
		//driver.findElement(By.id("hide-textbox")).click();
		//Boolean v=text.isDisplayed();
		//System.out.println(v);
		
		//hyper links
		
		List <WebElement> allLinks= driver.findElements(By.tagName("a"));
		int size=allLinks.size();
		for(int i=0;i<size;i++) {
			
			String links=allLinks.get(i).getText();
			System.out.println(links);
		}
		
				

	}

}
