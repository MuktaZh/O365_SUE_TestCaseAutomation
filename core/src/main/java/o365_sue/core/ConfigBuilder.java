package o365_sue.core;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.Properties;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public final class ConfigBuilder {
	
	public static String Broswer = GetBrowser();
	public static WebDriver Driver = ChooseDriver();
	public static String RootUrl = "https://portal.office.com";
	
	private static WebDriver ChooseDriver() {
		WebDriver driver = null;

		switch (Broswer) {
		case "IE":
			String path = Path.class.getResource("/Drivers/IEDriverServer_win32_2.42.0/IEDriverServer.exe").getPath();
			System.setProperty("webdriver.ie.driver",
					Path.class.getResource("/Drivers/IEDriverServer_win32_2.42.0/IEDriverServer.exe").getPath());
			driver = new InternetExplorerDriver();
			break;

		case "FIREFOX":
			driver = new FirefoxDriver();
			break;

		case "CHROME":
			System.setProperty("webdriver.chrome.driver",
					Path.class.getResource("/Drivers/ChromeDriver_Win32/chromedriver.exe").getPath());
			driver = new ChromeDriver();
			
		default:
			break;
		}

		return driver;
	}
	
	private static String GetBrowser(){
		String  browserType = ""; 		
		SAXReader saxReader = new SAXReader();	    
		Document document;
		//test code
		//String file = Path.class.getResource("/Drivers/IEDriverServer_win32_2.42.0/IEDriverServer.exe").getPath();
		
		try {			
			//document = saxReader.read(new File(classLoader.getResource("Config/RunConfig.xml").getFile()));
			document = saxReader.read(ClassLoader.getSystemResourceAsStream("Config/RunConfig.xml"));
			Element root = document.getRootElement();
			Element driverElement = root.element("Driver");
			browserType = driverElement.getText();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	}
			
		return browserType;
	}

}
