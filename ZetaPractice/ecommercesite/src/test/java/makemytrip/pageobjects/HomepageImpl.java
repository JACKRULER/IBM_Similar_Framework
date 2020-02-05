package makemytrip.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomepageImpl implements Homepage {
	
	public HomepageImpl(WebDriver driver) {
      // PageFactory.initElements((driver, this);
    }
	
	@FindBy(css =" span.chNavText.darkGreyText")
    private WebElement fromCity;
	
	@FindBy(css ="span.lbl_input.latoBold.appendBottom5")
	private WebElement toCity;
	
	
	@FindBy(css ="p.font14.appendBottom5.blackText ")
	private WebElement fromPlace;
	
	@FindBy(css =" p.font12.greyText.appendBottom3")
	private WebElement toPlace;
	
	
	@FindBy(css ="a.primaryBtn.font24.latoBlack.widgetSearchBtn")
	private WebElement searchButton;
	

	public void fromCity(String fromcity) {
		
		
	
	}

	public void toCity(String toCity) {
		// TODO Auto-generated method stub
		
	}

	public void fromPlace(String fromPlace) {
		// TODO Auto-generated method stub
		
	}

	public void toPlace(String toPlace) {
		// TODO Auto-generated method stub
		
	}

	public void fromDateSelection(String fromDate) {
		// TODO Auto-generated method stub
		
	}

	public void searchButton(String searchButton) {
		// TODO Auto-generated method stub
		
	}

	
}
