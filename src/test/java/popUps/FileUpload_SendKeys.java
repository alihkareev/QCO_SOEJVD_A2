package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_SendKeys {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    //opens the empty browser
	    WebDriver driver = new EdgeDriver();
	   
	    //for maximizing
	    driver.manage().window().maximize();
	  //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.foundit.in/");
	    driver.findElement(By.xpath("//div[contains[text(),'Upload Resume']")).click();
	    driver.findElement(By.id("file-upload")).sendKeys("C:\\Resumes\\Akhi_Resume.pdf");

	}

}
