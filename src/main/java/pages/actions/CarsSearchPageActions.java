package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsSearchPageLocators;
import pages.locators.CarsSearchResultPageLocators;

import utils.SeleniumDriver;

public class CarsSearchPageActions {

	CarsSearchPageLocators CarsSearchPageLocators=null;	
	
	public CarsSearchPageActions()
	{
		this.CarsSearchPageLocators = new CarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CarsSearchPageLocators);
		
	}
	
	public void selectCarMakeDropDown(String carBrand)
	{
		Select selectCarMaker = new Select(CarsSearchPageLocators.carMakeDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModelDropDown(String carModel)
	{
		Select selectCarModel = new Select(CarsSearchPageLocators.carModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}
	
	public void selectCarLocationDropDown(String carLocation)
	{
		Select selectCarLocation = new Select(CarsSearchPageLocators.carLocationDropDown);
		selectCarLocation.selectByVisibleText(carLocation);
	}
	
	public void selectCarPriceToDropDown(String carPrice)
	{
		Select selectCarPrice = new Select(CarsSearchPageLocators.carPriceDropDown);
		selectCarPrice.selectByVisibleText(carPrice);
	}
	
	public void clickFindMyNextCarButton()
	{
		CarsSearchPageLocators.findMyNextCarButton.click();
	}
	
}
