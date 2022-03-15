package JavaAlerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		String text = "Ajay";
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		// Single button on Alert, OK
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		// Multiple button on Alert, Ok/Cancel
		
		Thread.sleep(5000);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}