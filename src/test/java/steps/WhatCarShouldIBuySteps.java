package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.WhatCarShouldIBuyPageActions;
import utils.SeleniumDriver;

public class WhatCarShouldIBuySteps {

	CarsGuideHomePageActions CarsGuideHomePageActions = new CarsGuideHomePageActions();
	WhatCarShouldIBuyPageActions WhatCarShouldIBuyPageActions =new WhatCarShouldIBuyPageActions();

	@When("click on {string} _what_car_should_I_Buy")
	public void click_on__what_car_should_i_buy(String string) {
		CarsGuideHomePageActions.clickOnWhatShouldIBuy();
	}
	
	@Then("the page contains the following links")
	public void the_page_contains_the_following_links(io.cucumber.datatable.DataTable dataTable) {
	    
	}
	
	@And("click on {string} _header_Link")
	public void click_on__header_link(String string) {
		WhatCarShouldIBuyPageActions.clickonCommercial();
	}
	
	@Then("the {string} page should open")
	public void the_page_should_open(String expectedTitle) {
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println("Search Cars Page Title -actual- "+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
