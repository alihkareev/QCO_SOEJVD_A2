package ScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_WithCoordinates {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
        //opens the empty browser
        WebDriver driver = new EdgeDriver();
       
        //for maximizing
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        
        WebElement careers = driver.findElement(By.xpath("//a[text()='Careers']"));
        Point CoOrdinates = careers.getLocation();
        int x = CoOrdinates.getX();
        int y = CoOrdinates.getY();
        
        // // DownCasting
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+", "+y+")");
        
        //careers.click();
        js.executeScript("arguments[0].click();", careers);
      
        
	}

}
