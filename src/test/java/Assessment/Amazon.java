package Assessment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("mobile");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    String parent = driver.getWindowHandle();
	    driver.findElement(By.xpath("//span[contains(text(),'OnePlus 11 5G (Eternal Green, 8GB RAM, 128GB Storage)')]")).click();
	    Set<String>child = driver.getWindowHandles();
	    for(String b:child) {
	    	driver.switchTo().window(b);
	    }
	    //WebElement price= driver.findElement(By.xpath("(//span[@id='productTitle']/../../../../..//span[text()='₹56,998'])[2]"));
	    WebElement price= driver.findElement(By.xpath("(//span[@id='productTitle']/ancestor::div//span[text()='₹56,998'])[2]"));
	    System.out.println(price.getText());
	    Thread.sleep(3000);
	    driver.quit();
	    }
	}


