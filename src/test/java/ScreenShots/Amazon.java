package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
	    //opening empty  browser
	    WebDriver driver = new EdgeDriver();
	   //for maximizing
	    driver.manage().window().maximize();
	  //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.amazon.in/");
	    //DownCasting
	    TakesScreenshot ts= (TakesScreenshot) driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./Snaps/amazon.png");
	    FileUtils.copyFile(src, dest);
	    
	}

}
