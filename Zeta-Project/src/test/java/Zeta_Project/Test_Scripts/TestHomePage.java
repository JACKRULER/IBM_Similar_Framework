package Zeta_Project.Test_Scripts;

import org.testng.annotations.Test;



/**
 * 
 */
public class TestHomePage extends BaseTestClassMyApplication {
	
	//ApplicationBaseClass obj1 = new ApplicationBaseClass();
	

	

    @Test
    public void enterFromCity()
    {
    	homepage.fromCityOrigin("Delhi");
    	
    	System.out.println("Executed successfully");
    }
    
    @Test
    public void enterToCity()
   
    {
    	homepage.toCityDestination("Mumbai ");
    	System.out.println("Too city Executed successfully");
    }
    
    @Test
    public void selectFromPlace()
   
    {
    	homepage.selectFromPlace("test");
    	System.out.println("selectFromPlace done successfully");
    }
    @Test
    public void selectToPlace()
    {
    	homepage.selectToPlace("test");
    }
    
}
