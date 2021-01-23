package openingbrowsers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iteration {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\webdriver\\\\\\\\\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://testhing.com/academy/demo/webelements/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get attribute
		
		WebElement name=driver.findElement(By.id("name"));
		String placeholder=name.getAttribute("placeholder");
		System.out.println(placeholder);
		Thread.sleep(2000);
		
		
		
		//Iterating over radio button
		
		List <WebElement> radiobtn=driver.findElements(By.xpath("//input[contains(@name,'cars')and contains(@type,'radio')]"));
		int size=radiobtn.size();
		for(int i=0;i<size;i++) {
			boolean radiosel=radiobtn.get(i).isEnabled();
			if(!radiosel) {
				
				radiobtn.get(i).click();		
			}
		}
		
		System.out.println("over");
		
		List <WebElement> checkbtn=driver.findElements(By.xpath("//input[contains(@name,'cars')and contains(@type,'checkbox')]"));
		int sz=checkbtn.size();
		for(int k=0;k>sz;k++) {
			boolean checksel=checkbtn.get(k).isSelected();
			if(!checksel) {
				checkbtn.get(k).click();
				
			}
			
			System.out.println("com");
					
		}
		

	}

}
