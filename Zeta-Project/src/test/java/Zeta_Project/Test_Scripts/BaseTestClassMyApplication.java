package Zeta_Project.Test_Scripts;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import Zeta_Project.PageObjects.Homepage;
import Zeta_Project.PageObjects.HomepageImplementation;
import Zeta_Project.appRelated.ApplicationBaseClass;
import Zeta_Project.appRelated.ApplicationController;






public class BaseTestClassMyApplication extends ApplicationBaseClass{
   
	
	Homepage homepage;
    

    @BeforeClass
    public void setUp() throws Exception {
    	ApplicationController.instance.start();
        switch (ApplicationController.browserType) {
            case CHROME:
            	homepage = new HomepageImplementation(driver());
            	break;
            
        }
    }

    @AfterClass
    public void tearDown() {
    	ApplicationController.instance.stop();
    }
}
