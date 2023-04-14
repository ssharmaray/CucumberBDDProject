package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarsSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {

	UsedCarsSearchPageLocators UsedCarsSearchPageLocators=null;	
	
	public UsedCarsSearchPageActions()
	{
		this.UsedCarsSearchPageLocators = new UsedCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), UsedCarsSearchPageLocators);
		
	}
	
	public void selectUsedCarMakeDropDown(String usedCarBrand)
	{
		Select selectUsedCarMaker = new Select(UsedCarsSearchPageLocators.usedCarMakeDropDown);
		selectUsedCarMaker.selectByVisibleText(usedCarBrand);
	}
	
	public void selectUsedCarModelDropDown(String usedCarModel)
	{
		Select selectUsedCarModel = new Select(UsedCarsSearchPageLocators.usedCarModelDropDown);
		selectUsedCarModel.selectByVisibleText(usedCarModel);
	}
	
	public void selectUsedCarLocationDropDown(String usedCarLocation)
	{
		Select selectUsedCarMLocation = new Select(UsedCarsSearchPageLocators.usedCarLocationDropDown);
		selectUsedCarMLocation.selectByVisibleText(usedCarLocation);
	}
	
	public void selectUsedCarPriceToDropDown(String usedCarPrice)
	{
		Select selectUsedCarPrice = new Select(UsedCarsSearchPageLocators.usedCarPriceDropDown);
		selectUsedCarPrice.selectByVisibleText(usedCarPrice);
	}
	
	public void clickFindMyNextCarButton_UsedCar()
	{
		UsedCarsSearchPageLocators.findMyNextCarButton_usedCar.click();
	}
}
