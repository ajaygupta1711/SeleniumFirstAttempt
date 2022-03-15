package Checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// TestNG is one of the testing framework 

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium with Java\\\\Software Installs_IMP\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		
		// Count the number of checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='Checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(2000);
		
		for (int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		
/*		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		driver.quit(); */
	}

}
