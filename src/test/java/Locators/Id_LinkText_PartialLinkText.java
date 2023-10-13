package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_LinkText_PartialLinkText {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
        //opens the empty browser
        WebDriver driver = new EdgeDriver();
       
        //for maximizing
        driver.manage().window().maximize();

        // to open the browser
        driver.get("https://www.facebook.com/");
        //address of email text field
        driver.findElement(By.id("email")).sendKeys("asdfghjk");
        //address of password text field
        driver.findElement(By.name("pass")).sendKeys("asdfgh");
        //address of login button
        //driver.findElement(By.name("login")).click();
      //address of forgotten password link
        //driver.findElement(By.linktext("forgotten password?")).click();
        driver.findElement(By.partialLinkText("?")).click();
	}

}