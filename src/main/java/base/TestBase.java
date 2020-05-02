package base;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import pages.BabyPage;
import pages.CreateAccountPage;
import pages.HelpPage;
import pages.LoginPage;
import pages.MenPage;
import pages.MenuBar;

@Listeners(listeners.Elitelisteners.class)
public class TestBase extends Saucelabs {
	public static MenuBar menuBar;
	public static CreateAccountPage creatPage;
	public static LoginPage loginPage;
	public static HelpPage helpPage;
	public static MenPage menPage;
	public static BabyPage babyPage;

	@BeforeSuite
	public void setUp() {

		if (Boolean.valueOf(getProperty("saucelabs"))) {
			// run test in saucelabs
			setSauceLabs();

		} else {

			// run test locally
			setDriver();
		}
		menuBar = PageFactory.initElements(driver, MenuBar.class);
		creatPage = PageFactory.initElements(driver, CreateAccountPage.class);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		helpPage = PageFactory.initElements(driver, HelpPage.class);
		menPage = PageFactory.initElements(driver, MenPage.class);
		babyPage = PageFactory.initElements(driver, BabyPage.class);
	}

	@AfterSuite
	public void tearDown() {

		driver.quit();
	}

}
