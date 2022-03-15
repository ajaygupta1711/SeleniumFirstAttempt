package Dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropdownRadioEnableDisable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");

		Thread.sleep(5000);
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen']")).isSelected());
		driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen']")).isSelected());
		
//		System.out.println(driver.findElement(By.name("custom_date_picker")).isEnabled());
		System.out.print(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		System.out.print(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		if(driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1"))
				{
					System.out.println("It's Enabled");
					Assert.assertTrue(true);
				}
		else
				{
					Assert.assertFalse(false);
				}
		
		
	}

}
