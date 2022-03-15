package Assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		@SuppressWarnings("deprecation")
		WebDriverWait w = new WebDriverWait(driver,20); 
		
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		
		driver.findElement(By.cssSelector("input[value='user']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[contains(text(), 'You will be limited to only fewer functionalities of the app. Proceed?')]")).getText());
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement selectDropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select (selectDropdown);
		dropdown.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-info'])[1]")));
		
//		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
//		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
//		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[3]")).click();
//		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[4]")).click();
	
		List <WebElement> products = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		
		for(int i=0; i<products.size(); i++)
		{
			products.get(i).click();
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.xpath("//label[contains(text(), 'I agree with the ')]")).click();
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		System.out.println(driver.findElement(By.xpath("//Strong[text()='Success!']")).getText());
	}

}