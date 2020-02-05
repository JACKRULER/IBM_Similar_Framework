package makemytrip.support;

import org.openqa.selenium.WebDriver;

public abstract class ApplicationBaseClass {
	
	protected WebDriver driver() {
		return ApplicationController.instance.driver;
	}

}
