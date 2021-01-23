package openingbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "C:\\webdriver\\IEDriverServer.exe");
		driver = new 	InternetExplorerDriver();
		driver.get("https://www.amazon.in/");

	}

}