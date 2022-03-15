package Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		String Name = "Ajay";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Wait to present the element
		String password = getPassword(driver);
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/"); // Open the link in tab
		driver.findElement(By.id("inputUsername")).sendKeys(Name); // Enter the value in Textbox
		driver.findElement(By.name("inputPassword")).sendKeys(password); // Enter the value in Textbox
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000); // for getting the text appear on screen
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); // Comparison and Confirmation of text
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+Name+",");
//		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.quit();
	}
	
	public static String getPassword (WebDriver driver) throws InterruptedException 
	{	
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] passwordArray = passwordText.split("'");
		

		//		String[] passwordArray2 = passwordText.split("");
		//		passwordArray[0]
		
		String password = passwordArray[1].split("'")[0];
		return password;
		
		//0th Index - Please use temporary password.
		//1st Index - rahulshettyacademy to Login. 
		
		//0th Index - rahulshettyacademy
		//1st Index - 
		
	}

}
