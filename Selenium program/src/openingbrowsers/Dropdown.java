package openingbrowsers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\webdriver\\\\\\\\\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://testhing.com/academy/demo/webelements/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Iteration over drop down
		//declare a drop down element as instance of select class
		
		Select ddlist=new Select(driver.findElement(By.id("carselect")));
		
		
		//select by index
		
		ddlist.selectByIndex(1);
		
		//select by value
		
		ddlist.selectByValue("honda");;
		
		
		//select by VisibleText
		ddlist.selectByVisibleText("Benz");
		
		
		//Iterating over and getting options
		
		List <WebElement> ddoptions= ddlist.getOptions();
		int size=ddoptions.size();
		for(int i=0;i<size;i++) {
			
			String name=ddoptions.get(i).getText();
			System.out.println(name);
			
			
		}
		
		
		
		
		
		

	}

}
