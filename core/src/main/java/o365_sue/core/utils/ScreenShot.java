package o365_sue.core.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class ScreenShot {
	
	// Name used as base for screen shot image files
		private String  imageName = "screenshot";
		
		private String  outFolder = "screenshot/";
		
		//Counts for photos taken
		public static  int count = 0;
		
		
		public void takeSreenshot(WebDriver driver) throws Exception 
	    {		
	        count++; 
	        String path = outFolder + imageName + count + ".jpg";       
		    File scrFile =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	        FileUtils.copyFile(scrFile, new File(path));
	    }

}
