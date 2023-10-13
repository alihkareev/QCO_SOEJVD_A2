package Basic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation1 {

	public static void main(String[] args) {
		 //WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches");
	        //opens the empty browser
	        WebDriver driver = new ChromeDriver();
	        
	        
	        //for maximizing
	        driver.manage().window().maximize();
	     // to open the browser
	        driver.navigate().to("https://www.amazon.com/");	
	        // to open the browser
	        driver.get("https://www.facebook.com/");
		}

	}


