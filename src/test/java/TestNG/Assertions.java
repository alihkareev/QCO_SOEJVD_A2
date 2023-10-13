package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	WebDriver driver;
	
	@Test
	 public void fb() {
	WebDriverManager.edgedriver().setup();
    //opens the empty browser
    driver = new EdgeDriver();
   
    //for maximizing
    driver.manage().window().maximize();
  //implicit wait
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // to open the browser
    driver.get("https://www.facebook.com/");
    String title = driver.getTitle();
    //Hard Assert
    //Assert.assertEquals(title, "sdfghjkl");
    SoftAssert s =  new SoftAssert();
    s.assertEquals(title, "asdf");
    
    System.out.println(driver.getCurrentUrl());
    
	}
	
	@Test
	
	public void quit() {
	driver.close();
}
}
