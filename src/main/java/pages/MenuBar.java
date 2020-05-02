package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class MenuBar extends PageBase {

	@FindBy(xpath = "//a[@class='user-account']")
	public WebElement accountLikn;

	@FindBy(xpath = "//button[@value='Create Account']")
	public WebElement createAccountLink;

	@FindBy(xpath = "//a[@class='user-account regisreduser']")
	public WebElement userlink;

	// this is model window element
	@FindBy(xpath = "//div[@class='bx-wrap']")
	public WebElement modelWindow;
	// this is model window close element
	@FindBy(xpath = "//a[@data-click='close']")
	public WebElement modelClose;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	public WebElement logoutLink;

	@FindBy(xpath = "//strong[text()=' HELP ']")
	public WebElement helpLink;

	@FindBy(xpath = "//li[@class='toplevel equal']/a[contains(text(),'Men')]")
	public WebElement menLink;

	@FindBy(xpath = "//ul[@class='menu-category level-1']/li[5]")
	public WebElement BabyLink;

}
