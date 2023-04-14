package pages.actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.FindADealerPageLocators;
import utils.SeleniumDriver;

public class FindADealerPageActions {

	FindADealerPageLocators FindADealerPageLocators =null;
	
	public FindADealerPageActions()
	{
		this.FindADealerPageLocators = new FindADealerPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), FindADealerPageLocators);
	}
	
	public void selectDealerCarMakeDropDown(String dealerCarBrand)
	{
		Select selectDealerCarMaker = new Select(FindADealerPageLocators.dealerCarMakeDropDown);
		selectDealerCarMaker.selectByVisibleText(dealerCarBrand);
	}
	
	public void selectDealerLocationDropDown(String dealerLocation)
	{
		Select selectDealerLocation = new Select(FindADealerPageLocators.dealerLocationDropDown);
		selectDealerLocation.selectByVisibleText(dealerLocation);
	}
	
	public void selectDealerCarModelDropDown(String dealerCarModel)
	{
		Select selectDealerCarModel = new Select(FindADealerPageLocators.dealerCarModelropDown);
		selectDealerCarModel.selectByVisibleText(dealerCarModel);
	}
	
	public void selectDealerServiceCentre(boolean hasdealerServiceCentres) throws InterruptedException
	{
		if(hasdealerServiceCentres == true)
		{
			FindADealerPageLocators.dealerServiceCentres.click();
		}
	}
	
	public void selectDealerParts(boolean hasdealerParts) throws InterruptedException
	{
		if(hasdealerParts == true)
		{
			FindADealerPageLocators.dealerParts.click();
		}
		Thread.sleep(2000);
	}
	
	public void clickFindDealersButtonr()
	{
		FindADealerPageLocators.dealerFindDealersButton.click();
	}
	
	public String findDealersErrorMessage() throws InterruptedException
	{
		System.out.println("Error Message --- "+FindADealerPageLocators.dealerErrorMessage.getText());
		Thread.sleep(3000);
		return FindADealerPageLocators.dealerErrorMessage.getText();
	}
	
	public void IsDealerCarMakeDropDown(String dealerCarBrand)
	{
		Select selectDealerCarMaker = new Select(FindADealerPageLocators.dealerCarMakeDropDown);
		selectDealerCarMaker.selectByVisibleText(dealerCarBrand);
	}
	
	public boolean IsDealerCarModelDropDownDiaplayedOrNot()
	{
		return FindADealerPageLocators.dealerCarModelropDown.isDisplayed();
		
	}
		
	
	
	
}
