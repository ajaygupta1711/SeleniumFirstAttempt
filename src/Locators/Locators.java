package Locators;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		// Flow of browser invoice, link open, enter valid credentials and click on Login button
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver(); // Invoice the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Wait to present the element
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/"); // Open the link in tab
		driver.findElement(By.id("inputUsername")).sendKeys("Ajay"); // Enter the value in Textbox
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); // Enter the value in Textbox
		driver.findElement(By.className("signInBtn")).click(); // Click on button
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // Verify and fetch the text in Console
		driver.findElement(By.linkText("Forgot your password?")).click(); // Click on link
		Thread.sleep(1000); // Java provided to wait from one page to another
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ajay"); // Enter the value in Textbox 
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ajay.gupta@gmail.com"); // Enter the value in Textbox
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear(); // // Remove the value from Textbox
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ajay.gupta123@gmail.com"); // Enter the value in Textbox
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9930705505"); // Enter the value in Textbox
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Ajay");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
	//	driver.findElement(By.xpath("//button[contains(@class,'submit')]']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
	//	driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
	//	driver.quit();
		}
}
