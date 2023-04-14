package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.WhatCarShouldIBuyPageLocators;
import utils.SeleniumDriver;

public class WhatCarShouldIBuyPageActions {
	
	WhatCarShouldIBuyPageLocators WhatCarShouldIBuyPageLocators =null;
	
	public WhatCarShouldIBuyPageActions()
	{
		this.WhatCarShouldIBuyPageLocators = new WhatCarShouldIBuyPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), WhatCarShouldIBuyPageLocators);
	}
	
	public void clickonCommercial()
	{
		WhatCarShouldIBuyPageLocators.buyCommercial.click();
	}
}
