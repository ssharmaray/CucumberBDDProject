package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsSearchResultPageLocators;
import utils.SeleniumDriver;

public class CarsSearchResultPageActions {

	CarsSearchResultPageLocators CarsSearchResultPageLocators=null;
	
	public CarsSearchResultPageActions()
	{
		this.CarsSearchResultPageLocators = new CarsSearchResultPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CarsSearchResultPageLocators);
	}
	
	public String searchResultErrorMessage()
	{
		System.out.println("Error Message --- "+CarsSearchResultPageLocators.searchResultErrorMessage.getText());
		return CarsSearchResultPageLocators.searchResultErrorMessage.getText();
	}
}
