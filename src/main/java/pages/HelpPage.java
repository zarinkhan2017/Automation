package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class HelpPage extends PageBase {

	@FindBy(xpath = "//a[text()='COVID-19 Updates']")
	public WebElement covid19;

	@FindBy(xpath = "//a[text()='Where is my order?']")
	public WebElement WhereMyOrder;

	@FindBy(xpath = "//ul[@class='accordion']//li/p[text()='Online']")
	public WebElement onlineHelp;
	
	@FindBy(xpath = "//ul[@class='accordion']//li/p[text()='Products & Collaborations']")
	public WebElement collarborationLink;
	
	@FindBy(xpath = "//a[text()='Product Availability']")
	public WebElement productAvailableLink;
	
	

}
