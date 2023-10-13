package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionpopup {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    //opens the empty browser
	    WebDriver driver = new EdgeDriver();
	   
	    //for maximizing
	    driver.manage().window().maximize();
	  //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in/");;
       //address of date
        driver.findElement(By.xpath("//span[text()='Date']")).click();
        driver.findElement(By.xpath("//div[text()='Sep']/../../../..//span[@class='DayTiles_CalendarDaysSpan-sc-1xum02u-1 nwoYtA']")).click();
	}

}
