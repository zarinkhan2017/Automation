package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestCreateAccount extends TestBase {

	@BeforeClass
	public void classSetUp() {

		try {
			// this is for model window to close
			if (menuBar.modelWindow.isDisplayed()) {

				menuBar.modelClose.click();
			}
			menuBar.accountLikn.click();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Test
	public void testCreate() throws InterruptedException {

		creatPage.createAccountLink.click();
		creatPage.createSignIn(creatPage.emailCreateBox, "borsonqa@gmail.com");
		creatPage.createSignIn(creatPage.confirmEmailCreatBox, "borsonqa@gmail.com");
		creatPage.createSignIn(creatPage.FirsCreateName, "borson");
		creatPage.createSignIn(creatPage.LastCreateName, "khan");
		creatPage.maleRadioButton.click();
		creatPage.createSignIn(creatPage.birthBox, "01/01/1988");
		creatPage.createSignIn(creatPage.createPasswordBox, "Automation2020");
		creatPage.createSignIn(creatPage.createConfirmPasswordBox, "Automation2020");
		creatPage.saveButton.click();
		Thread.sleep(3000);
		String errorDuplicateAccount = creatPage.erroTextForDuplicateAccount.getText();
		String expectedResult = creatPage.expectedResulfForDuplicateAccount.getText();
		Assert.assertEquals(errorDuplicateAccount, expectedResult);

	}

	@Test
	public void testWithEmptyEmailField() {
		try {
			creatPage.createAccountLink.click();
		} catch (Exception e) {
		}
		creatPage.signinWithSubmit(creatPage.emailCreateBox, " ");
		String errorEmailTest = creatPage.emailErrorCreateBox.getText();
		Assert.assertEquals(errorEmailTest, "Please enter an email address.");

	}

	@Test
	public void testWithEmptyFirstField() {
		try {
			creatPage.createAccountLink.click();
		} catch (Exception e) {
		}
		creatPage.signinWithSubmit(creatPage.FirsCreateName, " ");
		String errorFirstTest = creatPage.errorFirstNameBox.getText();
		Assert.assertEquals(errorFirstTest, "Please enter First Name.");

	}

	@Test
	public void testWithEmptyLastNameField() {
		try {
			creatPage.createAccountLink.click();
		} catch (Exception e) {
		}
		creatPage.signinWithSubmit(creatPage.LastCreateName, " ");
		String errorlastTest = creatPage.errorLastNameBox.getText();
		Assert.assertEquals(errorlastTest, "Please enter Last Name.");

	}

}
