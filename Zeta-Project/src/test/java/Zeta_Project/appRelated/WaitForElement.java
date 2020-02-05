package Zeta_Project.appRelated;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Function;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WaitForElement extends ApplicationBaseClass
{
	public static void waitForElementToBeClickable(WebDriver driver , WebElement elementToBeLoaded)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
	}
	public static void waitForElementToBeVisible(WebDriver driver , WebElement elementToBeLoaded)
	{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
	}
	public static void waitForElementToBeVisible(WebDriver driver , By element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	public static void waitForElementToBeVisible(WebDriver driver , List<WebElement> listOfElementToBeLoaded)
	{
		WebDriverWait wait = new WebDriverWait(driver, 15);
	 	wait.until(ExpectedConditions.visibilityOfAllElements(listOfElementToBeLoaded));
	}
	public static void waitForElementToInvisible(WebDriver driver, List<WebElement> element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.invisibilityOfAllElements(element));
	}
	
	public static void waitForElementToInvisible(WebDriver driver, By element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
	}
	public static void waitForElementToInvisible(WebDriver driver, By element, String text)
	{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(element, text));
	}
	
	public static void waitForElementToBeMatch(WebDriver driver, List<WebElement> element, String textToBeMatch)
	{
		boolean flag = false;
		WebDriverWait wait = new WebDriverWait(driver, 2);
		for (int i = element.size()-2; i < element.size(); i++) 
		{
			try{
				wait.until(ExpectedConditions.textToBePresentInElement(element.get(i), textToBeMatch));
				flag = true;
				break;
			}catch(Exception e)
			{
				flag = false;
			}
		}
		if(flag == false)
			Assert.fail();
	}
//	public static void waitForLastElementToBeMatch(WebDriver driver, List<WebElement> element, String textToBeMatch)
//	{
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.textToBePresentInElement(element.get(element.size()-1), textToBeMatch));
//	}
	public static void waitForAjaxToComplete(WebDriver driver)
	{
		boolean flag = ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
		System.out.println(flag);
	}
	
	// public static void waitForInvisibilityOfElement(WebDriver driver, WebElement element, String className, String elementName, String text)
	// {

	// 	WebDriverWait wait = new WebDriverWait(driver, 10);
	// 	try
	// 	{
	// 		wait.until(ExpectedConditions.invisibilityOfElementWithText(elementToBeLoaded));
	// 	}
	// 	catch(TimeoutException e)
	// 	{
	// 	//	takeScreenShot(driver, elementName);
	// 	}	

	// }

/*	public static boolean waitForJSandJQueryToLoad(WebDriver driver) {
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    // wait for jQuery to load
	    ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
	      @Override
	      public Boolean apply(WebDriver driver) {
//	        try {
	          return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
//	        }
//	        catch (Exception e) {
//	          // no jQuery present
//	          return true;
//	        }
	      }
	    };
	    // wait for Javascript to load
	    ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
	      @Override
	      public Boolean apply(WebDriver driver) {
	        return ((JavascriptExecutor)driver).executeScript("return document.readyState").toString().equals("complete");
	      }
	    };
	    
	  return wait.until(jQueryLoad) && wait.until(jsLoad);
	}
		
	public static void waitForAjax(WebDriver driver, String action) 
	{
		String status = "";
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	    JavascriptExecutor executor =((JavascriptExecutor)driver);
//	    while(!status.equals("Not Found"))
//	    {
	       Object response = executor.executeAsyncScript(
	       "var callback = arguments[arguments.length - 1];" +
	    			       "var xhr = new XMLHttpRequest();" +
	    			       "xhr.onreadystatechange = function() {" +
	    			       "  if (xhr.readyState == 4 && xhr.status == 200) {" +
	    			       		"console.log(xhr.responseText);" +
	    			       "    callback(xhr.responseText);" +
	    			       "  }" +
	    			       "};" +
	    			       "xhr.open('GET', '/" + action + "', false);" +
	    			       "xhr.send();");
//	       JsonObject json = new JsonParser().parse((String) response);
//	       assertEquals("cheese", json.get("food").getAsString());
	       System.out.println("\n"+"Response : "+response.toString());
	       status = response.toString();
//	    }
	}
		*/
	
	public static void waitForPageToLoad(WebDriver driver) 
	{
	    ExpectedCondition < Boolean > pageLoad = new ExpectedCondition < Boolean > () {
	        public Boolean apply(WebDriver driver) {
	            return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
	        }
	    };
	    Wait < WebDriver > wait = new WebDriverWait(driver, 60);
	    try {
	        wait.until(pageLoad);
	    } catch (Throwable pageLoadWaitError) {
	     //   assertFalse("Timeout during page load", true);
	    }
	}
	
	@SuppressWarnings("unchecked")
	public static WebElement fluentWaitForElement(WebDriver driver, final WebElement element){
		FluentWait<WebDriver> wait = new FluentWait(driver)
			    .withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(2, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);
		
		return wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver){
				return element;
			}
		});

			
	}
}