package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindADealerPageLocators {

	@FindBy(how=How.XPATH,using="//select[@id='franchise']")
	public WebElement dealerCarMakeDropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='location']")
	public WebElement dealerLocationDropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='model']")
	public WebElement dealerCarModelropDown;
		
	@FindBy(how=How.XPATH,using="//input[@id='post_code']")
	public WebElement dealerPostCode;
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Current Location')]")
	public WebElement dealerCurrentLocation;
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Service Centres')]")
	public WebElement dealerServiceCentres;
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Parts')]")
	public WebElement dealerParts;
	
	@FindBy(how=How.XPATH,using="//input[@id='keyword']")
	public WebElement dealerKeywords;
	
	@FindBy(how=How.XPATH,using="//a[@id='dealer-search-submit']")
	public WebElement dealerFindDealersButton;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Reset filters')]")
	public WebElement dealerResetFilters;
	
	@FindBy(how=How.XPATH,using="//h1[contains(text(),'Sorry, your search returned no results.')]")
	public WebElement dealerErrorMessage;
}
