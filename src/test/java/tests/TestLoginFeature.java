package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.PageBase;
import base.TestBase;

public class TestLoginFeature extends TestBase {

	@BeforeClass
	public void classSetUp() {

		try {
			// this is for model window to close
			if (menuBar.modelWindow.isDisplayed()) {

				menuBar.modelClose.click();
			}
			menuBar.accountLikn.click();
		} catch (Exception e) {
		}

	}

	@Test
	public void testWithLogin() throws InterruptedException {

		PageBase pg = new PageBase();

		loginPage.login("borsonqa@gmail.com", "Automation2020");

		loginPage.loginButton.click();
	

//		boolean allRightReserved = loginPage.allrightReserved.isDisplayed();
//
//		System.out.println(allRightReserved);

	}

}
