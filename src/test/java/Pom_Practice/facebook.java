package Pom_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.FacebookLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
        //opens the empty browser
        WebDriver driver = new EdgeDriver();
        //for maximizing
        driver.manage().window().maximize();
      //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // to open the browser
        driver.get("https://www.facebook.com/");
        FacebookLoginPage flp=new FacebookLoginPage (driver);
        flp.emailTextfield("akhi");
        flp.passwordTextfield("veeravalli");
        flp.loginButton();
	}

}
