package Miscellaneous_MaxWinBadSSLBrokenLinksCookiesScreenshot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenshotCapture {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // getScreenshotAs method will display only when you user TakeScreenshot with driver
		FileUtils.copyFile(src,new File("C:\\Users\\HP\\screenshot.png"));
		
	}

}
