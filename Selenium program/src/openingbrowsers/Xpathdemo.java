package openingbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\webdriver\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://testhing.com/academy/demo/webelements/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@onclick='displayAlert()']")).click();
		//driver.findElement(By.xpath("//div//a[@rel='home']")).click();
		
		//how to effectively use both relative and absolute xpath
		//driver.findElement(By.xpath("//div[@class='main-header-bar-wrap']//li[2]/a")).click();
		
		//using text to find element using xpath
		//syntax xpath//tagname[text()='value']
			//driver.findElement(By.xpath("//div[@class='main-navigation']//a[text()='Contact Us']")).click();
		
		//using contains to find element
		//syntax //tagname[contains(@attribute,'value')]
		//driver.findElement(By.xpath("//a[contains(@id,'open')]")).click();
			
			
			//using multiple contains
			//driver.findElement(By.xpath("//input[contains@class,'btn-style'] and contains[@value,'Confirm']")).click();
			
			//Using starts with
			//syntax //tagname[starts-with(@attribute,'value')]
			//driver.findElement(By.xpath("//a[starts-with(@class,'btn-style class1 class2')]")).click();
		
		//how to find parent and sibbling node
		//syntax parent= xpath of element//parent::<tag>
		//syntax preceeding sibbling =xpath//preceeding sibbling::<tag>
		//syntax following sibbling=xpath//following-sibbling::<tag>
			
			
		
		
		

	}

}
