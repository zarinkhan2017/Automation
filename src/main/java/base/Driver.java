package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadProperties;

public class Driver extends ReadProperties {

	public static WebDriver driver;

	public void setDriver() {

		if (getProperty("browser").equalsIgnoreCase("firefox")) {

			initFirefox();
		} else {

			initChrome();
		}

		setDriverProperties();
	}

	private void initFirefox() {

		driver = new FirefoxDriver();

	}

	private void initChrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public void setDriverProperties() {

		driver.manage().window().maximize();

		driver.get(getProperty("appUrl"));
	}

}
