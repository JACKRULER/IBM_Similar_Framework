package Report;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityScreenshot

{

public static void capturescreenshot(WebDriver driver,String screenshotName)

{

	try 
	{
		TakesScreenshot Sc = ((TakesScreenshot)driver);
		File source = Sc.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./Screenshots/"+""+screenshotName+".bmp"));
		System.out.println("Snapshot Taken");
	} 
	catch (Exception e) 
	{
		
		System.out.println("Error is Taking snapshot"+ e.getMessage());
	} 
}
}
