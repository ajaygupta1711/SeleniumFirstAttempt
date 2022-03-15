package StreamLambda;

import java.util.stream.Collectors;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import java.io.File;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import java.io.IOException;

public class WebtableSorting {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("E:\\Selenium with Java\\Selenium WebDriver with Java -Basics to Advanced+Frameworks_Udemy\\Section #14\\test.jpg"));
	
		// Click on column for sorting
		
		driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
		
		// Capture all webelements into list
		
		List <WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		// Capture text of all webelements into new(original) list
		
		List <String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		// Sort on the original list of step 3 -> sorted list
		
		List <String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		// Compare original list vs sorted list
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		
		// Scan the name column and with getText -> Beans -> Print the price of the Beans
		
		List <String> price= elementsList.stream().filter(s->s.getText().contains("Beans")).
		map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
	}

		private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

} 