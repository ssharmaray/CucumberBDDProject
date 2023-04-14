package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhatCarShouldIBuyPageLocators {

	@FindBy(how = How.XPATH, using="//a[contains(text(),'Commercial')]")
	public WebElement buyCommercial;
	
	@FindBy(how = How.LINK_TEXT, using="Convertible")
	public WebElement buyConvertible;
	
	@FindBy(how = How.LINK_TEXT, using="Coupe")
	public WebElement buyCoupe;
	
	@FindBy(how = How.LINK_TEXT, using="Hatchback")
	public WebElement buyHatchback;
	
	@FindBy(how = How.LINK_TEXT, using="People mover")
	public WebElement buyPeopleMover;
	
	@FindBy(how = How.LINK_TEXT, using="Sedan")
	public WebElement buySedan;
	
	@FindBy(how = How.LINK_TEXT, using="SUV")
	public WebElement buySUV;
	
	@FindBy(how = How.LINK_TEXT, using="Ute")
	public WebElement buyUte;
	
	@FindBy(how = How.LINK_TEXT, using="Wagon")
	public WebElement buyWagon;
	
	@FindBy(how = How.LINK_TEXT, using="Car Advice")
	public WebElement buyCarAdvice;
	
	@FindBy(how = How.LINK_TEXT, using="Buyers Guide")
	public WebElement buyBuyersGuide;
	
	@FindBy(how = How.LINK_TEXT, using="Buying tips")
	public WebElement buyBuyingTips;
	
}
