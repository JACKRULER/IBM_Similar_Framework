package makemytrip.support;


import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ApplicationController {
	
	public static Browser browserType = Browser.CHROME;
	
	public enum Browser {
		CHROME,
        FIREFOX,
       
    }
	
	public static ApplicationController instance = new ApplicationController();
    public WebDriver driver;

    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        
       
        switch(browserType){
            case CHROME:
            	System.setProperty("webdriver.chrome.driver", "WebDriverServer/chromedriver");
        		
        		 driver = new ChromeDriver();
        		
        		driver.get("https://www.makemytrip.com");
        		
                break;
            case FIREFOX:
            	System.setProperty("webdriver.chrome.driver", "WebDriverServer/chromedriver");
        		
        	   driver = new ChromeDriver();
        		
        		driver.get("https://www.makemytrip.com");
                break;
        				}
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
    }
    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    
} }
