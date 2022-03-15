package Miscellaneous_MaxWinBadSSLBrokenLinksCookiesScreenshot;
// import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MaximizeDeleteCookies {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "E:\\Selenium with Java\\Software Installs_IMP\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().deleteAllCookies();	
		
		driver.manage().deleteCookieNamed("SessionKey");
		driver.manage().addCookie(null);
		
	}

}
