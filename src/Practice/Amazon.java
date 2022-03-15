package Practice;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
// import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.Select;

public class Amazon {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		
		// Invoke the browser and open the link
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// Navigation for login page, enter the credentials and submit
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("ajay.gupta1711@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("amazon@1987");
		driver.findElement(By.id("signInSubmit")).click();
		
		// Search the product and click on name link
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Selenium Testing Tools Cookbook Second Edition" + "\n");
		driver.findElement(By.linkText("Selenium Testing Tools Cookbook Second Edition")).click();
		
		// Pending script to fetch the name of book - Need to analyze

		
		// Add to cart
		
		Set<String> windows = driver.getWindowHandles(); // [ParentId. ChildId, subchildId]
		Iterator <String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
//		String subchildId = it.next();
		driver.switchTo().window(childId);
		
//		driver.navigate().to("https://www.amazon.in/Selenium-Testing-Tools-Cookbook/dp/1784392510/ref=sr_1_5?keywords=Selenium+books&qid=1644043763&sr=8-5");
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		
		
		
//		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		
/*		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Xiomi Mobile" + "\n");
		driver.findElement(By.linkText("Xiaomi 11i 5G (Camo Green, 8GB RAM, 128GB Storage)")).click();
		driver.navigate().to("https://www.amazon.in/Xiaomi-Camo-Green-128GB-Storage/dp/B09QD22TJ1/ref=sr_1_1?keywords=xiaomi+mobile&qid=1644059936&sr=8-1");
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//input[@aria-labelledby='attachSiAddCoverage-announce']")).click(); */
	}


}