package makemytrip.test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import makemytrip.pageobjects.Homepage;
import makemytrip.support.ApplicationBaseClass;
import makemytrip.support.ApplicationController;




public class BaseTestClassMyApplication extends ApplicationBaseClass{
   
	
	Homepage homepage;
    

    @BeforeClass
    public void setUp() throws Exception {
    	ApplicationController.instance.start();
        switch (ApplicationController.browserType) {
            case CHROME:
            	break;
            case FIREFOX:
                break;
        }
    }

    @AfterClass
    public void tearDown() {
    	ApplicationController.instance.stop();
    }
}
