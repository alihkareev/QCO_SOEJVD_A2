package Generic_Libraries;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilities {
	//1.mouse hovering
 public void mouuseHover(WebDriver driver, WebElement ele) {
	 Actions a=new Actions(driver);
	 a.moveToElement(ele).perform();
 }
 //2.double clicking
 
 public void doubleClick(WebDriver driver, WebElement ele) {
	 Actions a=new Actions(driver);
	 a.doubleClick(ele).perform();
}
//3.Right clicking
 
 public void rightClick(WebDriver driver, WebElement ele) {
	 Actions a=new Actions(driver);
	 a.contextClick(ele).perform();
 }
 //4.drag and drop
 
 public void dragAndDrop(WebDriver driver, WebElement ele1,WebElement ele2) {
	 Actions a=new Actions(driver);
	 a.dragAndDrop(ele1,ele2).perform();
}
 
 //handling alter pop up clicking on OK
 public void alter(WebDriver driver) {
	 driver.switchTo().alert().accept();
 }
 //handling alter pop up clicking on OK
 public void alterCancel(WebDriver driver) {
	 driver.switchTo().alert().dismiss();
 }
 
 //7.child browser
 public void childBrowser(WebDriver driver) {
	 Set<String> child = driver.getWindowHandles();
	 for(String b:child) {
		 driver.switchTo().window(b);
	 }
 }
 //8.parent browser
 public void parentBrowser(WebDriver driver) {
	String parent = driver.getWindowHandle();
		 driver.switchTo().window(parent);
	 }
 }
 
 