package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Select the checkbox and grab the text
		
	 	driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input")).click();
        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();

        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
        Select s=new Select(dropdown);
        s.selectByVisibleText(opt);

		driver.findElement(By.id("name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		
		String text = driver.switchTo().alert().getText();
				
		if(text.contains(opt))

		{

			System.out.println("Alert message success");

		}

		else

		System.out.println("Something wrong with execution");
		
	}

}
