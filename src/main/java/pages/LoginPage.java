package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class LoginPage extends PageBase {

	@FindBy(xpath = "//div[@class='field-wrapper']//input[@type='text']")
	public WebElement emailField;

	@FindBy(xpath = "//div[@class='field-wrapper']//input[@type='password']")
	public WebElement passwordField;
	
	@FindBy(xpath = "//a[@class='user-account regisreduser']//p//span")
	public WebElement userLink;

	@FindBy(xpath = "//button[@class='logincheckout']")
	public WebElement loginButton;
	
	@FindBy(xpath = "//li[text()='© UNIQLO CO. LTD. All rights reserved. ']")
	public WebElement allrightReserved;

	public void login(String email, String password) {

		emailField.clear();
		emailField.sendKeys(email);
		passwordField.clear();
		passwordField.sendKeys(password);
//		loginButton.click();

	}

}
