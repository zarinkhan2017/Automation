package base;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase extends Driver {

	public void HoverOver(WebDriver driver, WebElement hover) {

		Actions action = new Actions(driver);

		action.moveToElement(hover).perform();

	}

	public void HoverOverClick(WebDriver driver, WebElement hoveOver) {

		Actions action = new Actions(driver);

		action.moveToElement(hoveOver).click().build().perform();

	}

	// supporting method for drop down
	public String getRandomlySelectedOption(WebElement element) {
		String option = null;

		Select select = new Select(element);
		int optionCount = select.getOptions().size();
		int randomIndex = getRandomNumber(1, optionCount - 1);
		select.selectByIndex(randomIndex);

		option = select.getFirstSelectedOption().getText();

		return option;
	}

	// supporting method for readomDropdown
	public int getRandomNumber(int min, int max) {
		int randomNumber = 0;
		Random random = new Random();
		randomNumber = random.nextInt(max + 1 - min) + min;
		return randomNumber;
	}

	public void dropDownHandle(WebElement ele, String value) {

		Select sel = new Select(ele);

		sel.selectByValue(value);
	}

	// go to child window
	public void switchChildWindow(WebDriver driver) {

		Set<String> windowId = driver.getWindowHandles();

		Iterator<String> itr = windowId.iterator();

		String mainWindow = itr.next();

		String childWindow = itr.next();

		driver.switchTo().window(childWindow);

	} // [ driver.close ] >>>> use this when you finish test script of child window
		// page

	// this method is for parentWindow >>>>
	public void switchToParentWindow() {

		Set<String> windowId = driver.getWindowHandles();

		Iterator<String> itr = windowId.iterator();

		String mainWindow = itr.next();

		// come back to main window
		driver.switchTo().window(mainWindow);
	}

	// this is supporting method for explicit wait for all kind of framework
	public void expliciteWaitVisible(WebDriver driver, WebElement ele, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);

		wait.until(ExpectedConditions.visibilityOf(ele));

		ele.click();

	}

	// this is supporting method for explicit wait for all kind of framework
	public void setexpliciteWait(WebDriver driver, WebElement ele, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);

		wait.until(ExpectedConditions.elementToBeClickable(ele));

		ele.click();

	}

	// this is supporting method for all framework ( click web element)
	public void clickByJavascriptExe(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click;", element);
	}

}
