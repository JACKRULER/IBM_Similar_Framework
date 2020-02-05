package sample.myarti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "WebDriverServer/chromedriver");
WebDriver driver = new ChromeDriver();

    	
        String baseUrl = "https://www.flipkart.com/";
        //String tagName = "";
                
                driver.get(baseUrl);
                
              //To maximise the browser
        		driver.manage().window().maximize();
        		   
             
                                //to enter phoneno (or) email id
                driver.findElement(By.cssSelector("input._2zrpKA._1dBPDZ")).sendKeys("9500973699");
                Thread.sleep(5000);
                System.out.println("mobile no printed successfully");
                //to enter the password
                driver.findElement(By.cssSelector("input._2zrpKA._3v41xv._1dBPDZ")).sendKeys("jack@123");
                Thread.sleep(5000);
                System.out.println("pwd successfully done");
                //to click the login button
                driver.findElement(By.cssSelector("button._2AkmmA._1LctnI._7UHT_c")).click();
                Thread.sleep(4000);
                System.out.println("successfully login");
               //searching the product in search box
                driver.findElement(By.cssSelector("input.LM6RPg")).sendKeys("redmi note 8 mobiles");
                Thread.sleep(3000);
                
               // System.out.println("searching the product");
                //to click the search button
               //driver.findElement(By.cssSelector("button.vh79eN")).click();
               //Thread.sleep(4000);
               //System.out.println("searched button clicked");
                //to enter into the product
             //WebElement Element= driver.findElement(By.xpath("//div[contains(text(),'Redmi Note 8 (Neptune Blue, 128 GB)')]"));
             //Element.click();
              //System.out.println("entering into the product");{
              //to scroll down the page
              //JavascriptExecutor js = (JavascriptExecutor) driver; 
            //This will scroll the page till the element is found		
              //js.executeScript("arguments[0].scrollIntoView();",Element );}
              //System.out.println("scrolled the product page and choosen the correct product");
              
              
              
              
              //JavascriptExecutor js1 = (JavascriptExecutor) driver;
            //this will scroll down the page by 1000 pixel vertical
              //js1.executeScript("window.scrollBy(0,3000)");
             

              //to add the product into cart
          //WebElement cart =  driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
          //cart.click();
          
          //ct is the obj for the webelement cart
          
          
          //to maximize the window this code may not work with selenium 3 jars.if script fails u can remove the line below
          //driver.manage().window().maximize();
          
          
          
    
          //System.out.println("product will going to add in cart");
          
          
           
           //to look into the cart
         // driver.findElement(By.xpath("//a[@class='_3ko_Ud']")).click();
                 //System.out.println("successfully added to cart");
                
                 
	}           
}
