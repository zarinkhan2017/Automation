package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class BabyPage extends PageBase {

	// this Custom xpath for getting index and best Approach to get WebElment
	@FindBy(xpath = "//ul[@class='menu-category level-1']/li[5]//div//ul[3]//li[3]")
	public WebElement outWearLink;

	@FindBy(xpath = "//div[@class='hover-wrapper hover-active']")
	public WebElement zipPorkaJacket;

	@FindBy(xpath = "//li[@class='grid-tile new-row'][2]//div[@class='product-name']")
	public WebElement zipPorkaJacletOne;

	@FindBy(xpath = "//div[@class='hover-wrapper hover-active']//div[3]//ul/li[5]")
	public WebElement blueColor;

	@FindBy(xpath = "//li[@class='grid-tile new-row'][2]//div[@class='product-name']")
	public WebElement clickJacketButton;

	@FindBy(xpath = "//select[@name='Quantity']")
	public WebElement dropDownTag;

	@FindBy(xpath = "//div[@class='quantity  halflength']")
	public WebElement quantityLink;

	@FindBy(xpath = "//a[@title='Age 18-24M']")
	public WebElement age1824;

	@FindBy(xpath = "//li[@class='selectable selctablevar']//img[@alt='Blue'][1]")
	public WebElement blueColorChice;
	
	@FindBy(xpath="//ul[@class='swatches 1 color']")
	public WebElement multiColor;
	
	@FindBy(xpath="//li[@class='selectable selctablevar']//a")
	public WebElement pinkColor;
	
	@FindBy(xpath="//div[@class='add-to-cart-alt']//button[@id='add-to-cart']")
	public WebElement addToBag;
	
	@FindBy(xpath = "//span[@class='minicart-icon']//strong")
	public WebElement showCart;
	
	@FindBy(xpath="//a[contains(text(),'View Bag')]")
	public WebElement viewBag;
	
	@FindBy(xpath="//a[contains(text(),'Close Bag')]")
	public WebElement closeToBag;

}
