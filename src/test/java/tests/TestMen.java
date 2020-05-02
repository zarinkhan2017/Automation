package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.PageBase;
import base.TestBase;

public class TestMen extends TestBase {
	@BeforeClass
	public void classSetUp() {
		// this is for model window to close
		if (menuBar.modelWindow.isDisplayed()) {

			menuBar.modelClose.click();
		}

	}

	@Test
	public void testChinosPant() {
		PageBase pg = new PageBase();

		pg.HoverOver(driver, menuBar.menLink);

		menPage.chinosPantLink.click();

		String titleChinos = driver.getCurrentUrl();

		Assert.assertTrue(titleChinos.contains("/us/en/men/chino-pants"));

	}
}
