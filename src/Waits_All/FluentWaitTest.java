package Waits_All;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("[id = 'start'] button")).click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver> (driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		    
			public WebElement apply(WebDriver driver) {
		    if (driver.findElement(By.xpath("//h4[contains(text(), 'Hello World!')]")).isDisplayed())
		    {
		    	return driver.findElement(By.xpath("//h4[contains(text(), 'Hello World!')]"));
		    }
		    else
		    	return null;
		}
		   });
	
		System.out.println(driver.findElement(By.xpath("//h4[contains(text(), 'Hello World!')]")).getText());

}
}