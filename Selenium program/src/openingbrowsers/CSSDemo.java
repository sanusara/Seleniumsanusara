package openingbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\webdriver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://testhing.com/academy/demo/webelements/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//Syntax: tagname[attribute='value']
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Saranya");
		
		//Incase  of cssSelector id can be represented as # symbol
		//Syntax: tagname#attributevalue or #attributevalue
		//driver.findElement(By.cssSelector("input#name")).sendKeys("Saranya");
		
		//Incase of class : .
		//Syntax: tagname.classname or .classname
		driver.findElement(By.cssSelector("input.inputs")).sendKeys("Saranya");
		
		//Using multiple class in cssselector
		//Syntax: classname1.classname2.classname3...
		driver.findElement(By.cssSelector(".btn-style.class1.class2")).click();
		
		//Using wild card
		//starting text to find the element : ^
		//Ending text to find the element: $
		//text contain to find the element: *
		
		//Syntax: tagname[attribute^='attributevalue']
		
		
		
		
		
			
		
		
		

	}

}
