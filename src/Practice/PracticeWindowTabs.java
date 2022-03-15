package Practice;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowTabs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set <String> newtab = driver.getWindowHandles();
		Iterator <String> it = newtab.iterator();
		String parentWindowId = it.next();
		String ChildWindowId = it.next();
		driver.switchTo().window(ChildWindowId);
		driver.get("https://rahulshettyacademy.com/#/learning-path");
		
		String courseName = driver.findElements(By.xpath("//h4/a")).get(0).getText();
		
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
		
		
	}

}
