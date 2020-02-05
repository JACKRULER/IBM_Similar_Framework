package sample.myarti;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "WebDriverServer/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
	

		String Homepageurl ="https://www.guru99.com/";
		String url ="";
		HttpURLConnection huc = null;
		int respcode = 200;
		
		driver.get(Homepageurl);
		driver.manage().window().maximize();
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 Iterator<WebElement> it = links.iterator();
		 while (it.hasNext())
		 {
			 url= it.next().getAttribute("href");
			 System.out.println(url);
			 if (url== null|| url.isEmpty())
			 {
				 System.out.println(" url is empty");
				 continue;
			 }
			 
			 
			 if (!url.startsWith(Homepageurl))
			 {
				 System.out.println("Url belongs to domain");
				 continue;
			 }
			 
			 try {
	                huc = (HttpURLConnection)(new URL(url).openConnection());
	                
	                huc.setRequestMethod("HEAD");
	                
	                huc.connect();
	                
	                respcode = huc.getResponseCode();
	                
	                if(respcode >= 400){
	                    System.out.println(url+" is a broken link");
	                }
	                else{
	                    System.out.println(url+" is a valid link");
	                }
	                    
	            } catch (MalformedURLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	        
	        driver.quit();
		 }
	}


