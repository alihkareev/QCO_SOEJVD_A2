package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName {
	

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
        //opens the empty browser
        WebDriver driver = new EdgeDriver();
       
        //for maximizing
        driver.manage().window().maximize();

        // to open the browser
        driver.get("https://www.amazon.in/");
        List<WebElement> allLinks = (List<WebElement>) driver.findElement(By.tagName("a"));
        for (WebElement b:allLinks) {
        	System.out.println(b.getText());
        }
}

	private static WebElement getText() {
		// TODO Auto-generated method stub
		return null;
	}
}
