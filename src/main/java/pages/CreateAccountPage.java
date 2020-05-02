package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class CreateAccountPage extends PageBase {

	@FindBy(xpath = "//button[@value='Create Account']")
	public WebElement createAccountLink;

	@FindBy(xpath = "//div[@class='bx-wrap']")
	private WebElement modelWindow;

	@FindBy(xpath = "//a[@data-click='close']")
	private WebElement modelClose;

	@FindBy(xpath = "//div[@class='field-wrapper']//input[@type='text']")
	private WebElement emailBox;

	@FindBy(xpath = "//input[@class='input-text password required']")
	private WebElement passwordBox;

	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_email']")
	public WebElement emailCreateBox;
	@FindBy(xpath = "//span[@id='dwfrm_profile_customer_email-error']")
	public WebElement emailErrorCreateBox;
	@FindBy(xpath = "Please enter an email address.")
	public WebElement expectedEmailResult;

	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_emailconfirm']")
	public WebElement confirmEmailCreatBox;

	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_firstname']")
	public WebElement FirsCreateName;
	@FindBy(xpath = "//span[@id='dwfrm_profile_customer_firstname-error']")
	public WebElement errorFirstNameBox;

	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_lastname']")
	public WebElement LastCreateName;
	@FindBy(xpath = "//span[@id='dwfrm_profile_customer_lastname-error']")
	public WebElement errorLastNameBox;

	@FindBy(xpath = "//input[@id='is-Male']")
	public WebElement maleRadioButton;

	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_birthday']")
	public WebElement birthBox;

	@FindBy(xpath = "//input[@class='input-text password required']")
	public WebElement createPasswordBox;

	@FindBy(xpath = "//input[@class='input-text passwordconfirm required']")
	public WebElement createConfirmPasswordBox;

	@FindBy(xpath = "//button[@name='dwfrm_profile_confirm']")
	public WebElement saveButton;

	@FindBy(xpath = "//button[@class='logincheckout']")
	public WebElement loginButton;

	@FindBy(xpath = "//div[@class='form-caption error-message']")
	public WebElement erroTextForDuplicateAccount;

	@FindBy(xpath = "//div[text()='Sorry, an account already exists for this email address']")
	public WebElement expectedResulfForDuplicateAccount;

	// this is supporting method for signin feature.
	public void signin(String email, String password) {

		emailBox.clear();
		emailBox.sendKeys(email);
		passwordBox.clear();
		passwordBox.sendKeys(password);
		loginButton.click();
	}

	// insert data for creating account or registration feature;
	public void createSignIn(WebElement element, String data) {

		element.clear();
		element.sendKeys(data);
		// saveButton.click();
	}

	public void signinWithSubmit(WebElement element, String data) {

		element.clear();
		element.sendKeys(data);
		saveButton.click();

	}
}
