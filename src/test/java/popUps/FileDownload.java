package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    //opens the empty browser
	    WebDriver driver = new EdgeDriver();
	   
	    //for maximizing
	    driver.manage().window().maximize();
	  //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://demoapp.skillrary.com/feedback.php");
	    driver.findElement(By.xpath("//input[@value='Download Invoice']")).click();

	}

}
