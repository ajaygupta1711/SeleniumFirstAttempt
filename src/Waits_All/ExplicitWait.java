package Waits_All;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w = new WebDriverWait(driver,10); // Define
		
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};  // Declare Array in Java
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//Explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//Explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
//		base b = new base();
//		base.addItems(driver, itemsNeeded);
		
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0; i<products.size(); i++)
		{
			
			
		String[] name = products.get(i).getText().split("-");
		String formattedName = name[0].trim();
		
		// Format it to get actual vegetable name
		// Check whether name you extracted is present is array or not - 
		// Convert array into array list for easy search
		
		 List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		

		if(itemsNeededList.contains(formattedName))
		{
			j++;
			// Click on add to cart
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if (j==itemsNeeded.length)
			{
				break;
			}
			
			}
		
	}
		
	}
	}
	
