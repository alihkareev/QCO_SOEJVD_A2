package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_related_Methods {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
        //opens the empty browser
        WebDriver driver = new EdgeDriver();
       
        //for maximizing
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // to open the browser
        driver.get("https://www.facebook.com/");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("asdfghj");
        Thread.sleep(3000);
        email.clear();
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

}
