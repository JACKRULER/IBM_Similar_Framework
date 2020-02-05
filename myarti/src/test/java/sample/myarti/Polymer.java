package sample.myarti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Polymer {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "WebDriverServer/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.polymer-project.org");
		
		
		
		
		
		//driver.quit();
	}

}
