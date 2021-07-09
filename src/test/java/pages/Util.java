package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util {
	
	private static WebDriver driver;
	
	public static WebDriver adriver () {
	
		return getDriver();
	}

	public static void abrirNavegador (String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Uol\\CompassoUol\\src\\main\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		getDriver().get(url);
		getDriver().manage().window().maximize();
		
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
}
