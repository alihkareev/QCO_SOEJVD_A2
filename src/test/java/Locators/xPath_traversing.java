package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPath_traversing {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
        //opens the empty browser
        WebDriver driver = new EdgeDriver();
       
        //for maximizing
        driver.manage().window().maximize();

        // to open the browser
        driver.get("https://www.amazon.in/s?k=mobile&crid=7Y2EWXWZRB0T&sprefix=mobile%2Caps%2C236&ref=nb_sb_noss_1");
        //WebElement value= driver.findElement(By.xpath("//span[text()='itel P55 5G | Dimensity 6080 | 12GB RAM*+128GB ROM with Memory Fusion| 50MP AI Dual Rear Camera| 5000mAh Battery | 2 Years Warranty | Mint Green']/../../../../../..//span[@class='a-price-whole']"));
        WebElement value = driver.findElement(By.xpath("//span[text()='itel P55 5G | Dimensity 6080 | 12GB RAM*+128GB ROM with Memory Fusion| 50MP AI Dual Rear Camera| 5000mAh Battery | 2 Years Warranty | Mint Green']/ancestor::div[@class='puisg-col puisg-col-4-of12 puisg-col-8-of-16 puisg-col-12-of-24 puis-list-col-right']//span[@class='a-price-whole']"));
         System.out.println(value.getText());
   }
}
