package SeleniumIntro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {

// chromedriver.exe -> chrome browser
		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\IMP Software Installs\\chromedriver.exe");
		
// webdriver.chrome.driver-> value of path
		
	 	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	//	driver.quit();
		
// Firefox Launch
// geckodriver
		
	//	System.setProperty("webDriver.gecko.driver", "E:\\Selenium with Java\\IMP Software Installs\\geckodriver32.exe");
		
	//	WebDriver driver = new FirefoxDriver();
	
	
// Edge Launch
// driver
	
/*	System.setProperty("webdriver.edge.driver", "E:\\Selenium with Java\\IMP Software Installs\\msedgedriver.exe");
	
	// webdriver.chrome.driver-> value of path

		 	WebDriver driver = new EdgeDriver();
			
			driver.get("https://www.google.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close(); */
	
}
}