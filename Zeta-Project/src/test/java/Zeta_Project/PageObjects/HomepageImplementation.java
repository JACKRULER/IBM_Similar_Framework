package Zeta_Project.PageObjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomepageImplementation implements Homepage {
	
	

	public  WebDriver driver;


	
	@FindBy(css =" span.chNavText.darkGreyText")
    private WebElement clickfromCity;
	
	@FindBy(css ="span.lbl_input.latoBold.appendBottom5")
	private WebElement selectSearchFromCity;
	
	
	@FindBy(css ="p.font14.appendBottom5.blackText ")
	private WebElement selectFromCityName;
	
	@FindBy(css =" p.font12.greyText.appendBottom3")
	private WebElement toPlace;
	
	
	@FindBy(css ="a.primaryBtn.font24.latoBlack.widgetSearchBtn")
	private WebElement searchButton;
	
	
	
	public HomepageImplementation(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}



	public void fromCityOrigin(String fromcity) {
		// TODO Auto-generated method stub
		clickfromCity.click();
	}



	public void toCityDestination(String toCity) {
		// TODO Auto-generated method stub
		this.selectSearchFromCity.click();
	}



	public void selectFromPlace(String fromPlace) {
		// TODO Auto-generated method stub
		this.selectFromCityName.click();
		
		List<WebElement> e=driver.findElements(By.cssSelector("selectFromCityName"));
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
	}



	public void selectToPlace(String toPlace) {
		// TODO Auto-generated method stub
		
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
	}










	
}
