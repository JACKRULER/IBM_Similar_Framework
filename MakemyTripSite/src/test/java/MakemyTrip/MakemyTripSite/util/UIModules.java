package MakemyTrip.MakemyTripSite.util;

import com.google.inject.AbstractModule;

import MakemyTrip.MakemyTripSite.Ui.Homepage;
import MakemyTrip.MakemyTripSite.Ui.Implementation.HomepageImplementation;

public class UIModules extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(Homepage.class).to(HomepageImplementation.class);
	}

}
