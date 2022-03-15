package WebElmntsHeightWidth;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementHeightWidth {

	public static void main(String[] args) throws IOException {
		
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
		
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		
		// Capture the screenshot of WebElement
		
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("WebElement.jpg"));
		
		// Get Height and Width
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}

}