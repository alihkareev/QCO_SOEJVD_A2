package TestNG_Parallel;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compatibility {
	@Parameters({"browsername"}) //give this once after converting into suite file 
 @Test
public void fb(String browser) {
	WebDriver driver;
	if(browser.equals("edge")) {
	WebDriverManager.edgedriver().setup();
    //opens the empty browser
     driver = new EdgeDriver();
	}
	else {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_DOEJVD_A2\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
	}
    //for maximizing
    driver.manage().window().maximize();
  //implicit wait
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // to open the browser
    driver.get("https://www.facebook.com/");
}
}

