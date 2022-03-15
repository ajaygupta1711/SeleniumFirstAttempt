package WindowActivities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		Thread.sleep(1000);
		driver.navigate().to("https://rahulshettyacademy.com/");
		Thread.sleep(1000);
//		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
	}

}
