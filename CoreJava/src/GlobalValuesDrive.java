import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Selenium with Java\\SeleniumFirstAttemptD\\CoreJava\\src\\data.preperties");
		prop.load(fis); // load the file in reading mode
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		
		// Store, use this file in write mode, update the value in data file that is passing in run time 
		
		FileOutputStream fos = new FileOutputStream("E:\\\\Selenium with Java\\\\SeleniumFirstAttemptD\\\\CoreJava\\\\src\\\\data.preperties"); 
		prop.store(fos, null);
	}

}
