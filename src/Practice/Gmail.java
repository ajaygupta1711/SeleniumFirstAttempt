package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='admin']")).click();
	//	driver.findElement(By.xpath("//select[@class='form-control']")).click();
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.xpath("//input[@name='terms']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("iphone X")).click();
		//		driver.findElement(By.xpath("//a[normalize-space()='iphone X']")).click();
		
		
	}

}
