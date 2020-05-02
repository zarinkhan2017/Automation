package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class MenPage extends PageBase {

	@FindBy(xpath = "//span[text()='Sale']")
	public WebElement saleLink;

	@FindBy(xpath = "//a[contains(text(),'Chino Pants')]")
	public WebElement chinosPantLink;

	@FindBy(xpath = "//span[text()='Featured']")
	public WebElement featureLnk;

	@FindBy(xpath="//a[text()='Slim Fit']")
	public WebElement slimFitLink;

}
