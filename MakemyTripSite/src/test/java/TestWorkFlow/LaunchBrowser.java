package TestWorkFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "WebDriverServer/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		
		
		
		driver.findElement(By.cssSelector(" span.chNavText.darkGreyText")).click();
		driver.findElement(By.cssSelector(" span.lbl_input.latoBold.appendBottom5")).click();
		
		String pageTitlte= driver.getTitle();
		Assert.assertEquals("Flight Booking, Flight Tickets Booking at Lowest Airfare | MakeMyTrip", pageTitlte);
		System.out.println("Title is : "+pageTitlte);
		
		
		List<WebElement> e=driver.findElements(By.cssSelector(" p.font14.appendBottom5.blackText"));
        System.out.println("List of places are:" +e.size());
        
        for(WebElement w:e)
        	

        {
	System.out.println(w.getText());
	
	if (w.getText().equalsIgnoreCase("Delhi, India")) {
		w.click();
		System.out.println("clicked");
		
		break;
		
	  }
  
	}
        
        System.out.println("Check for To place drop down");
    	

		List<WebElement> toplaces = driver.findElements(By.cssSelector("p.font12.greyText.appendBottom3"));
        System.out.println("List of To places are:"+toplaces.size());


        for(WebElement w1:toplaces)

        {
	System.out.println(w1.getText());
	
	if (w1.getText().equalsIgnoreCase("Chhatrapati Shivaji International Airport")) 
	{
		w1.click();
		
		
		System.out.println("clicked To places also");
		break;
	  }
  
	}
        
        String expectedMonth="O ";
        String expectedDate="29";
        
        /* calender function */  
        
     //driver.findElement(By.xpath("((//div[@class='DayPicker-Month'])[1]//div/p)[19]")).click();
        for(int i=0; i<=20;i++) {
        	
        }
        
        for (int i=1;i<=2;i++) {
        	String currentMonth=driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])["+i+"]//div[@class='DayPicker-Caption']")).getText();
        	
        	if (currentMonth.contains(expectedMonth))
        	
        	{
        		List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])["+i+"]//div[@class='dateInnerCell']"));
        		for (int j=1;j<=dates.size();j++) 
        		
        			{
        			String currentDate = driver.findElement(By.xpath("((//div[@class='DayPicker-Month'])["+i+"]//div[@class='dateInnerCell'])["+j+"]")).getText();
        			
        			String currentDate5 = driver.findElement(By.xpath("((//div[@class='DayPicker-Month'])["+i+"]//div[@class='dateInnerCell'])["+j+"]/p")).getText();
        			
        			if(currentDate5.equalsIgnoreCase(expectedDate)) {
        				driver.findElement(By.xpath("((//div[@class='DayPicker-Month'])["+i+"]//div[@class='dateInnerCell'])["+j+"]")).click();
        				break;
        			}
        			
        			// System.out.println("clicked To Date" +currentDate5);
        			
        		}
        		
            break;	
            
            
            }
        	else 
        	{
        		driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
        		
        		{
        			List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])["+i+"]//div[@class='dateInnerCell']"));
            		for (int j=1;j<=dates.size();j++) 
            		
            			{
            			String currentDate = driver.findElement(By.xpath("((//div[@class='DayPicker-Month'])["+i+"]//div[@class='dateInnerCell'])["+j+"]")).getText();
            			
            			String currentDate5 = driver.findElement(By.xpath("((//div[@class='DayPicker-Month'])["+i+"]//div[@class='dateInnerCell'])["+j+"]/p")).getText();
            			
            			if(currentDate5.equalsIgnoreCase(expectedDate)) {
            				driver.findElement(By.xpath("((//div[@class='DayPicker-Month'])["+i+"]//div[@class='dateInnerCell'])["+j+"]")).click();
            				break;
            			}
        		}
            }
        }
        
        
        
        
    driver.findElement(By.cssSelector("a.primaryBtn.font24.latoBlack.widgetSearchBtn")).click();
  System.out.println("Clicked the search button");
     Thread.sleep(5000);
     driver.findElement(By.cssSelector("#stop_group > span:nth-child(2)")).click();
     System.out.println("Clicked the checkbox ");
		
     driver.findElement(By.xpath("//*[@id=\"bookbutton-RKEY:18956af6-0cb8-4bea-abba-47238e66a663:0\"]" )).click();
     
driver.quit();
        }}}
