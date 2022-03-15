package Dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownCalendar {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
		
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTNR\"]//a[@value='BLR']")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); // Not like Index in Code, Please Change
		driver.findElement(By.xpath("//div[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR\"]//a[@value='MAA']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
	}

}
