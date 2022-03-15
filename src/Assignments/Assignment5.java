package Assignments;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[contains(text(), 'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]")).click();
		
		Set <String> window = driver.getWindowHandles();
		Iterator <String> it = window.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.xpath("//h3[contains(text(), 'New Window')]")).getText());
			
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(), 'Opening a new window')]")).getText());

	}

}
