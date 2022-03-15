package Miscellaneous_MaxWinBadSSLBrokenLinksCookiesScreenshot;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List <WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		
		for (WebElement link : links)  // Enhanced for loop
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection(); 
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The link with text " +link.getText()+" is broken with code" + respCode);
			
		}
		
		a.assertAll();
		
		// Broken URL - Java methods will call URL's and gets you the status code
		// Step1 - All URL's tied up to the links using selenium
		// If status code is gerater than 400 then that URL is not working -> Link which tied to URL is broken	
//		String url = driver.findElement(By.cssSelector("a[href*='soupui']")).getAttribute("href");
		
		
	}

}