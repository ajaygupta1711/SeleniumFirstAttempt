package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		// Siblings - Child - Parent Driver
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		System.out.println(driver.findElement(By.xpath("//html//div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//html//div/button[1]/parent::div/button[2]")).getText());
	}

}
