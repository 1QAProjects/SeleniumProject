package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testcase1 {
	
	 public static void main(String[] args) {
	        // Set the property for the FirefoxDriver
	        System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");

	        // Create a new instance of the FirefoxDriver
	        WebDriver driver = new FirefoxDriver();

	        // Navigate to a webpage
	        driver.get("https://www.google.com");

	        // Close the browser window
	        driver.quit();
	    }


}
