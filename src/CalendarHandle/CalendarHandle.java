package CalendarHandle;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("travel_date")).click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// April 23
		
		// While loop will keep on executing until it becomes false
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		
		@SuppressWarnings("unused")
		List <WebElement> dates = driver.findElements(By.cssSelector(".day"));
		
		// Grab the common attributes, Put into list and Iterate
		
		int count = driver.findElements(By.cssSelector(".day")).size();
		
		for (int i=0; i<count; i++)
		{
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if (text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
		
}

}
