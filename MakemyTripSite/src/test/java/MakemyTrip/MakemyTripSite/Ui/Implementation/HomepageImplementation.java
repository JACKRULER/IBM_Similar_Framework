package MakemyTrip.MakemyTripSite.Ui.Implementation;

import MakemyTrip.MakemyTripSite.Ui.Homepage;
import MakemyTrip.MakemyTripSite.Ui.SearchPage;

public class HomepageImplementation implements Homepage{

	public HomepageImplementation menuSelection(String menu) {
		
		System.out.println("Menu selected"+menu);
		return this;
		// TODO Auto-generated method stub
		
		
		
	}
	
	

	public HomepageImplementation fromCityselection(String fromcity) {
		System.out.println("FromCity selected"+fromcity);
		
		return this;
		// TODO Auto-generated method stub
		
	}

	public HomepageImplementation toCityselection(String tocity) {
		System.out.println("ToCity selected"+tocity);
		return this;
		// TODO Auto-generated method stub
		
	}

	public HomepageImplementation departureDateSelection(String date) {
		System.out.println("departure date selected"+date);
		return this;
		// TODO Auto-generated method stub
		
	}

	public SearchPage search() {
		// TODO Auto-generated method stub
		
		return null;
	}
	

}
