package ActionsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// Create Action Class with object a and pass the driver to build the capability
		
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"));
		
//		a.moveToElement(driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"))).build().perform();
		
		// Move to specfic element
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			
		// Right Clock on SignIn
		
		a.moveToElement(move).contextClick().build().perform();
		
	}

}
