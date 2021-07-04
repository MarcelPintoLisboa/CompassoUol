package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Util {
	public  ChromeDriver driver;
	public  ChromeDriver getDriver(String string) {
		
	
	if (driver == null) {
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "C:\\WEB_DRIVERS\\chromedriver.exe");
    	driver = new ChromeDriver();
        driver.get("www.google.com");
	}
	return driver;
}
	private static void fail(String string) {
		// TODO Auto-generated method stub
		
	}


}



