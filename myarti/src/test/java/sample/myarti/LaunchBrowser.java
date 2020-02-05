package sample.myarti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "WebDriverServer/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login & Signup"));
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input._2zrpKA._1dBPDZ")).click();
		System.out.println("Element clicked");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input._2zrpKA._1dBPDZ")).sendKeys("9632905678");
		System.out.println("Element entered the details");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input._2zrpKA._3v41xv._1dBPDZ")).sendKeys("sasmita@21");
		System.out.println("Entered the password");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button._2AkmmA._1LctnI._7UHT_c")).click();
		System.out.println("Successfully Logged in");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input.LM6RPg")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.LM6RPg")).sendKeys("Motorola Mobile phones");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("path._2BhAHa")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a")).click();
		System.out.println("Low to High");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		System.out.println("Added to cart");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		//driver.quit();
	}

}
