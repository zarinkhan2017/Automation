package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.PageBase;
import base.TestBase;

public class TestBabyFeature extends TestBase {

	@BeforeClass
	public void classSetUp() {

		try {
			if (menuBar.modelWindow.isDisplayed()) {

				menuBar.modelClose.click();
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void testPurchaseBlueJacket() throws InterruptedException {
		PageBase pg = new PageBase();

		pg.HoverOver(driver, menuBar.BabyLink);

		babyPage.outWearLink.click();

		pg.HoverOver(driver, babyPage.zipPorkaJacket);

		// babyPage.blueColor.click();

		babyPage.clickJacketButton.click();

		String title = driver.getCurrentUrl();

		Assert.assertTrue(title.contains("/toddler-light-warm-padded-full-zip-parka"));
	}

	

}