package pages.locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewCarsSearchPageLocators {

	@FindBy(how = How.XPATH, using="//select[@id='makes']")
	public WebElement newCarMakeDropDown;
	
	@FindBy(how = How.XPATH, using="//select[@id='models']")
	public WebElement newCarModelDropDown;
	
	@FindBy(how = How.XPATH, using="//select[@id='locations']")
	public WebElement newCarLocationDropDown;
	
	@FindBy(how = How.XPATH, using="//select[@id='priceTo']")
	public WebElement newCarPriceDropDown;
	
	@FindBy(how = How.XPATH, using="//input[@id='search-submit']")
	public WebElement findMyNextCarButton_newCar;
}
