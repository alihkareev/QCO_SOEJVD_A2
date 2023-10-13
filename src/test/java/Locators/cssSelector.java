package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelector {

	public static void main(String[] args)throws Throwable {
		WebDriverManager.edgedriver().setup();
        //opens the empty browser
        WebDriver driver = new EdgeDriver();
       
        //for maximizing
        driver.manage().window().maximize();

        // to open the browser
        driver.get("https://www.facebook.com/");
        //address of email text field
          driver.findElement(By.cssSelector("input[id='email']")).sendKeys("afgh");
          driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("asdfgh");
          Thread.sleep(2000);
          driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
