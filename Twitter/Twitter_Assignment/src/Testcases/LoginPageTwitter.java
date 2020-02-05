package Testcases;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Report.UtilityScreenshot;
import common.ReadProp;

	public class LoginPageTwitter 
	{
		
		//Login page for Twitter
		
		private static WebDriver driver ;
		static ReadProp rf= new ReadProp();
		static String filep="data.properties";
			//initializing the username and password
		
		static String  url_address  =rf.getValue(filep, "url");
		static String user_name    =rf.getValue(filep, "user");
		static String pwdofuser    =rf.getValue(filep, "pwd");
		String search_text =rf.getValue(filep, "search_text");
		
		private static String username="//div[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input";
		private static String password="//div[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input";
		private static String loginButton="//div[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]";
		private static String searchBox="//input[@id='search-query']";
		private static String searchButton="//button[@type='submit']";
		private static String top =".//*[@id='page-container']/div[2]/div[1]/ul/li[1]/a";
		private static String userDorpDown="user-dropdown";
		private static String viewAll="//*[@id='stream-items-id']/li[2]/div[1]/h3/a";
		private static String followAll="//div[@class='ProfileCard-actions']/div/div/div/button";
		private static String followBarak="//div[@data-name='President Obama']/button";
		
		private static final int MAX_TIMEOUT = 240;
		private static final int MIN_TIMEOUT = 10;
		private static WebDriverWait wait;
		
		/*@BeforeTest
		public void setUp() throws exception
		{
			//ProfilesIni profile = new ProfilesIni();
			//FirefoxProfile myprofile = profile.getProfile("jagadeesh");
			driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.manage().window().maximize();		
			
			
		}*/
		


		  @BeforeClass(alwaysRun = true)
		  public void setUp() throws Exception {
			  driver= new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				wait = new WebDriverWait(driver, MAX_TIMEOUT);
		  }

		
		@Test
		public void test() throws Exception
		
		{
			loginTwitter(url_address,user_name,pwdofuser);
			searchforPOTUS(search_text);
			followPOTUS();
			logoutTwitter();
			
		}
		

		public void loginTwitter(String url_add1,String user_address,String user_pwd) throws Exception
		{
			driver.get(url_add1);
			driver.findElement(By.linkText("Log In")).click();
			driver.findElement(By.xpath(username)).sendKeys(user_address);
			driver.findElement(By.xpath(password)).sendKeys(user_pwd);
			driver.findElement(By.xpath(loginButton)).click();
			waitForObjectVisible(By.xpath(searchBox));
			UtilityScreenshot.capturescreenshot(driver ,"Login Twitter");				
			}
		
		public void searchforPOTUS(String search_text) throws InterruptedException
		{
			waitForObjectVisible(By.xpath(searchBox));
			driver.findElement(By.xpath(searchBox)).sendKeys(search_text);
			driver.findElement(By.xpath(searchButton)).click();
			Thread.sleep(3000);
			String actual = driver.findElement(By.xpath("//div[@id='page-container']/div/h1")).getText();
			Assert.assertEquals(actual, search_text);
			driver.findElement(By.xpath(top)).click(); 
			UtilityScreenshot.capturescreenshot(driver ,"POTUS Searched");
		}
		
		public void followPOTUS() throws Exception 
	
		{		

	      /* List<WebElement> elements = driver.findElements(By.xpath(followAll));    
	       System.out.println("Test7 number of elements: " + elements.size());

	       Actions action = new Actions(driver);
	            for(WebElement ele : elements){
	              action.moveToElement(ele).click().build().perform();
	            } 
	            */
			waitForObjectClickable(By.xpath(followBarak));
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath(followBarak))).click().build().perform();
			Thread.sleep(2000);
			System.out.println("clicked the following button");
			UtilityScreenshot.capturescreenshot(driver ,"Follow_clicked");			
		}
		
		
		public void logoutTwitter() 
		{
			//driver.findElement(By.id(userDorpDown)).click();
			driver.findElement(By.xpath(".//*[@id='user-dropdown-toggle']")).click();
			driver.findElement(By.xpath(".//*[@id='signout-button']/button")).click(); 
			
		}
		
		public boolean waitForObjectClickable(By locator) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
				wait.until(ExpectedConditions.elementToBeClickable(locator));
				return true;
			} catch (Exception ex) {
				return false;
			}
		}
		
		public boolean waitForObjectVisible(By locator) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
				return true;
			} catch (Exception ex) {
				return false;
			}
		}
		
		@AfterTest
		public void down()
		{
			driver.quit();
		}
		
	}
		

		




