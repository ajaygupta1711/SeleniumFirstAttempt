package Dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownsMultiSelect {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Dropdown with multiple select like passengers info

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

	/*	int i = 1; // Initialization
		while (i < 3) // Compare
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			driver.findElement(By.id("hrefIncChd")).click();
			driver.findElement(By.id("hrefIncInf")).click();
			i++;
		} */
		
		for (int i = 1; i < 3; i++) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());	
		driver.quit();

	}

}
