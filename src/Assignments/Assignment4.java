package Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Assignment4 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium with Java\\\\Software Installs_IMP\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		@SuppressWarnings("deprecation")
		WebDriverWait w = new WebDriverWait(driver, 20);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.product-name")));
		
		List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0; i<products.size(); i++)
		{
//			products.get(i).click();
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		}	
		
	}

}