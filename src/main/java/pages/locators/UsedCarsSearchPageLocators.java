package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarsSearchPageLocators {

	@FindBy(how = How.XPATH, using="//select[@id='makes']")
	public WebElement usedCarMakeDropDown;
	
	@FindBy(how = How.XPATH, using="//select[@id='models']")
	public WebElement usedCarModelDropDown;
	
	@FindBy(how = How.XPATH, using="//select[@id='locations']")
	public WebElement usedCarLocationDropDown;
	
	@FindBy(how = How.XPATH, using="//select[@id='priceTo']")
	public WebElement usedCarPriceDropDown;
	
	@FindBy(how = How.XPATH, using="//input[@id='search-submit']")
	public WebElement findMyNextCarButton_usedCar;
}
