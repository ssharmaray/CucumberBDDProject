package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators CarsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions()
	{
		this.CarsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CarsGuideHomePageLocators);
	}
	
	//Action Methods for MenuItems	
	public void moveToBuyAndSellMenu()
	{
		Actions action =new Actions(SeleniumDriver.getDriver());
		action.moveToElement(CarsGuideHomePageLocators.buy_and_sell_MenuItem).perform();
	}
	
	public void moveToReviewsMenu()
	{
		Actions action =new Actions(SeleniumDriver.getDriver());
		action.moveToElement(CarsGuideHomePageLocators.reviews_MenuItem).perform();
	}
	
	public void moveToNewsMenu()
	{
		Actions action =new Actions(SeleniumDriver.getDriver());
		action.moveToElement(CarsGuideHomePageLocators.news_MenuItem).perform();
	}
	
	public void moveToAdviceMenu()
	{
		Actions action =new Actions(SeleniumDriver.getDriver());
		action.moveToElement(CarsGuideHomePageLocators.advice_MenuItem).perform();
	}
	
	public void moveToPricingAndSpecsMenu()
	{
		Actions action =new Actions(SeleniumDriver.getDriver());
		action.moveToElement(CarsGuideHomePageLocators.pricing_and_specs_MenuItem).perform();
	}
	
	public void moveToGuidesMenu()
	{
		Actions action =new Actions(SeleniumDriver.getDriver());
		action.moveToElement(CarsGuideHomePageLocators.guides_MenuItem).perform();
	}
	
	//Action Methods for Sub-Menu Items
	public void clickOnSearchCars()
	{
		CarsGuideHomePageLocators.search_Cars_SubMenuItem.click();
	}
	
	public void clickOnUsedCars()
	{
		CarsGuideHomePageLocators.used_Cars_SubMenuItem.click();
	}
	
	public void clickOnNewCar()
	{
		CarsGuideHomePageLocators.new_Cars_SubMenuItem.click();
		
	}
	
	public void clickOnFindADealer()
	{
		CarsGuideHomePageLocators.find_a_dealer_SubMenuItem.click();
		
	}
	
	public void clickOnWhatShouldIBuy()
	{
		CarsGuideHomePageLocators.what_should_i_buy_SubMenuItem.click();
	}
	
	public void moveToSellMyCar()
	{
		CarsGuideHomePageLocators.sell_My_Car_SubMenuItem.click();
	}
	
	public void moveToManageMyAd()
	{
		CarsGuideHomePageLocators.manage_My_Ad_SubMenuItem.click();
	}
	
	public void moveToCarSellingTips()
	{
		CarsGuideHomePageLocators.car_Selling_Tips_SubMenuItem.click();
	}
	
	
	
	
	
	
}
