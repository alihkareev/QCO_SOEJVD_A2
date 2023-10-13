package DropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class single_dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
	    //opens the empty browser
	    WebDriver driver = new EdgeDriver();
	   
	    //for maximizing
	    driver.manage().window().maximize();
	  //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    // to open the browser
	    driver.get("https://www.amazon.in/");
	    //address of DropDown
	    WebElement dD= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	    //handling drop downs
	    Select s = new Select(dD);
	    s.selectByIndex(2);
	    Thread.sleep(3000);
	    s.selectByValue("search-alias=baby");
	    Thread.sleep(3000);
        s.selectByVisibleText("Car & Motorbike");
	    System.out.println(s.isMultiple());
	    
	    List<WebElement> value = s.getOptions();
	    System.out.println(value.size());
	    for (WebElement b : value) {
	    System.out.println(b.getText());
	}
	}
	}


