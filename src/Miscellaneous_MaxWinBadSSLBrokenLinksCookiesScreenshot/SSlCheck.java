package Miscellaneous_MaxWinBadSSLBrokenLinksCookiesScreenshot;
// import java.util.Map;
// import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.edge.EdgeOptions;

public class SSlCheck {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions(); // Create Class and Object
		options.setAcceptInsecureCerts(true);
	
		// For Chrome Browser
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());    
		
		// For Edge Browser
		
/*		EdgeOptions options = new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.edge.driver", "E:\\Selenium with Java\\Software Installs_IMP\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());        */
		
		
		// Add Extention with automated browser
		
//		options.addExtensions("");
		
		// Proxy Setup
		
/*		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:8080");
		options.setCapability("proxy", proxy);		*/
		
		// Block Popup in case of flight booking website, like popup for location
		
/*		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));    */
		
		// File download on desired location
		
/*		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);          */
		

	}

}