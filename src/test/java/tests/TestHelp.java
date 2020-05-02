package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.PageBase;
import base.TestBase;

public class TestHelp extends TestBase {
	@BeforeClass
	public void classSetUp() {
		try {
			// this is for model window to close
			if (menuBar.modelWindow.isDisplayed()) {

				menuBar.modelClose.click();
			}
			menuBar.helpLink.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		PageBase pg = new PageBase();

		pg.switchChildWindow(driver);
	}

	@Test
	public void testHelpWindow() throws InterruptedException {

		helpPage.covid19.click();

		String title = driver.getCurrentUrl();

		Assert.assertTrue(title.contains("articles/en_US/FAQ/"));

		driver.close();
	}

	@Test
	public void testHelpPage() {
		PageBase pg = new PageBase();

		helpPage.collarborationLink.click();

	}

}