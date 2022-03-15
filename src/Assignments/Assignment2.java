package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
		// Invoke the browser
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open the link
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// Fill the form fields (text/radio/dropdown)
			
		driver.findElement(By.name("name")).sendKeys("Ajay Gupta");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("ajay.gupta@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ajay@123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement selectDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(selectDropdown);
		dropdown.selectByVisibleText("Female");
		
		driver.findElement(By.name("inlineRadioOptions")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("07-02-2022");
		
		// click on submit button
		
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']/strong")).getText());
			
	}

}
