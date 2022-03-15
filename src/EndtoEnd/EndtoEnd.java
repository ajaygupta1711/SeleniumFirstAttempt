package EndtoEnd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
		
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTNR\"]//a[@value='BLR']")).click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//div[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR\"]//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		if(driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1"))
			{
			System.out.println("It's Enabled");
			Assert.assertTrue(true);
			}
		else
			{
			Assert.assertFalse(false);
			}
		
		
		driver.findElement(By.cssSelector("input[id*='ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends']")).click();
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

		WebElement selectDropdown = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
		Select dropdown = new Select(selectDropdown);
		dropdown.selectByValue("5");
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		
		Thread.sleep(3000);
		
		WebElement selectDropdown1 = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
		Select dropdown1 = new Select (selectDropdown1);
		dropdown1.selectByVisibleText("INR");
		
		driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit']")).click();
		
	}

}