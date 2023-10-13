package TestNG_failingPurpose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	@Test
	 
	 public void snapdeal() {
		WebDriverManager.edgedriver().setup();
	    //opens the empty browser
	    WebDriver driver = new EdgeDriver();
	   
	    //for maximizing
	    driver.manage().window().maximize();
	  //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    // to open the browser
	    driver.get("https://www.snapdeal.com/");
}
}