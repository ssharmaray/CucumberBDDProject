package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.NewCarsSearchPageLocators;
import utils.SeleniumDriver;
public class NewCarsSearchPageActions {

	NewCarsSearchPageLocators NewCarsSearchPageLocators = null;
	
	public NewCarsSearchPageActions()
	{
		this.NewCarsSearchPageLocators=new NewCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), NewCarsSearchPageLocators);
	}
	
	public void selectNewCarMakeDropDown(String newCarBrand)
	{
		Select selectNewCarMaker = new Select(NewCarsSearchPageLocators.newCarMakeDropDown);
		selectNewCarMaker.selectByVisibleText(newCarBrand);
	}
	
	public void selectNewCarModelDropDown(String newCarModel)
	{
		Select selectNewCarModel = new Select(NewCarsSearchPageLocators.newCarModelDropDown);
		selectNewCarModel.selectByVisibleText(newCarModel);
	}
	
	public void selectNewCarLocationDropDown(String newCarLocation)
	{
		Select selectNewCarMLocation = new Select(NewCarsSearchPageLocators.newCarLocationDropDown);
		selectNewCarMLocation.selectByVisibleText(newCarLocation);
	}
	
	public void selectNewCarPriceToDropDown(String newCarPrice)
	{
		Select selectNewCarPrice = new Select(NewCarsSearchPageLocators.newCarPriceDropDown);
		selectNewCarPrice.selectByVisibleText(newCarPrice);
	}
	
	public void clickFindMyNextCarButton_newCar()
	{
		NewCarsSearchPageLocators.findMyNextCarButton_newCar.click();
	}
	
}
