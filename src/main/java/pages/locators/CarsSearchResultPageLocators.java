package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsSearchResultPageLocators {

	@FindBy(how = How.XPATH, using="//p[contains(text(),\"There doesn't seem to be any cars that exactly match your criteria.\")]")
	public WebElement searchResultErrorMessage;
}
