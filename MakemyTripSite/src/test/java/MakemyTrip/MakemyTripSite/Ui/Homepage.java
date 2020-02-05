package MakemyTrip.MakemyTripSite.Ui;

import MakemyTrip.MakemyTripSite.Ui.Implementation.HomepageImplementation;

public interface Homepage {

	
	public HomepageImplementation menuSelection(String menu);
	
	public HomepageImplementation fromCityselection(String fromcity);
	
	public HomepageImplementation toCityselection(String tocity);
	
	public HomepageImplementation departureDateSelection(String date);
	
	public SearchPage search();
	
}
