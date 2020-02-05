package Zeta_Project.appRelated;

import org.openqa.selenium.WebDriver;



public abstract class ApplicationBaseClass {
	
	protected WebDriver driver() {
		return ApplicationController.instance.driver;
	}

}
