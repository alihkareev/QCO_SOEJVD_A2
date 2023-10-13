package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_ancestors {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
        //opens the empty browser
        WebDriver driver = new EdgeDriver();
       
        //for maximizing
        driver.manage().window().maximize();

        // to open the browser
        driver.get("https://www.amazon.in/Lenovo-IdeaPad-12450H-Backlit-83BF000UIN/dp/B0CFF518HZ/ref=sr_1_3?crid=3U52ZII6Y1F7G&keywords=lenovo+ideapad+slim+5+intel+core+i5+12450h&nsdOptOutParam=true&qid=1696828909&sprefix=lenovo+ideapad+slim+5+intel+core+i5%2Caps%2C212&sr=8-3");
        
        WebElement price = driver.findElement(By.xpath("//span[contains(text(),lenovo IdeaPad Slim 5 Intel Core i5 12450H 16')]) [3]/ancestor::div[@id='centerCol']//span[@class='a-price-whole']"));
        		System.out.println(price.getText());
	}

}
