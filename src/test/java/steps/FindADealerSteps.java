package steps;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.FindADealerPageActions;
import utils.SeleniumDriver;
import pages.actions.CarsGuideHomePageActions;

public class FindADealerSteps {

	FindADealerPageActions FindADealerPageActions = new FindADealerPageActions();
	CarsGuideHomePageActions CarsGuideHomePageActions = new CarsGuideHomePageActions();

	@And("click on {string} _find_a_dealer")
	public void click_on__find_a_dealer(String string) throws InterruptedException {
		CarsGuideHomePageActions.clickOnWhatShouldIBuy();
		Thread.sleep(3000);
	}


	@Then("the Find a Dealer page title should be {string}")
	public void the_find_a_dealer_page_title_should_be(String expectedTitleFindADealerPage) {
		String actualTitleFindADealerPage = SeleniumDriver.getDriver().getTitle();
		System.out.println("Dealer Page Title -actual- "+actualTitleFindADealerPage);
		Assert.assertEquals(actualTitleFindADealerPage, expectedTitleFindADealerPage);
	}
	
	@When("select DealerCarMake as {string} from AnyMake dropdown")
	public void select_dealer_car_make_as_from_any_make_dropdown(String dealerCarBrand) throws InterruptedException {
		Thread.sleep(5000);
		FindADealerPageActions.selectDealerCarMakeDropDown(dealerCarBrand);
	}	
		
	@And("select DealerLocation as {string} from AnyLocation dropdown")
	public void select_dealer_location_as_from_any_location_dropdown(String dealerLocation) {
		FindADealerPageActions.selectDealerLocationDropDown(dealerLocation);
	}
	
//	@And("select DealerModel as {string} from AnyModel dropdown")
//	public void select_dealer_model_as_from_any_model_dropdown(String dealerModel) {
//		FindADealerPageActions.selectDealerCarModelDropDown(dealerModel);
//	}
	
	@And("choose Service Centres checkbox as {string}")
	public void choose_service_centres_checkbox_as(String hasdealerServiceCentres) throws InterruptedException {		
		FindADealerPageActions.selectDealerServiceCentre(Boolean.parseBoolean(hasdealerServiceCentres));  
	}

	@And("choose Parts checkbox as {string}")
	public void choose_parts_checkbox_as(String hasdealerParts) throws InterruptedException {
		FindADealerPageActions.selectDealerParts(Boolean.parseBoolean(hasdealerParts));
	}
	
	@And("click on Find Dealers button")
	public void click_on_find_dealers_button() {
		FindADealerPageActions.clickFindDealersButtonr();
	}
	
	@Then("I should see the list_of_dealers")
	public void i_should_see_the_list_of_dealers() {
	    
	}
	
	@And("the dealer page title should be {string}")
	public void the_dealer_page_title_should_be(String expectedTitleAfterFindDealerClick) {
		String actualTitleAfterFindDealerClick = SeleniumDriver.getDriver().getTitle();
		System.out.println("Dealer Page Title after Find dealer click -actual- "+actualTitleAfterFindDealerClick);
		Assert.assertEquals(actualTitleAfterFindDealerClick, expectedTitleAfterFindDealerClick);
	}
	
	@And("the error message {string} is displayed")
	public void the_error_message_is_displayed(String expectedErrorMessage) throws InterruptedException {	    
		String actualErrorMessage = FindADealerPageActions.findDealersErrorMessage();
		System.out.println("Dealer page - Error Message - "+actualErrorMessage);
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}
	

//	@When("DealerCarMake dropdown is not {string}")
//	public void dealer_car_make_dropdown_is_not(String dealerCarMake) {
//		FindADealerPageActions.IsDealerCarMakeDropDown(dealerCarMake);
//		System.out.println("--Smita -- car Make -- "+ dealerCarMake);
//	}
	
	@Then("DealerCarModel dropdown {string}")
	public void dealer_car_make_dropdown_appears(String isDealerCarModelDisplayed) throws InterruptedException {
		System.out.println("--- isDealerCarModelDisplayed value is = " + isDealerCarModelDisplayed );
		if(isDealerCarModelDisplayed.contains("appears"))
		{
			Assert.assertEquals(true,FindADealerPageActions.IsDealerCarModelDropDownDiaplayedOrNot());
			System.out.println("--- car Model dropdown -- "+ FindADealerPageActions.IsDealerCarModelDropDownDiaplayedOrNot());
		}
		else
		{
			Assert.assertEquals(false,FindADealerPageActions.IsDealerCarModelDropDownDiaplayedOrNot());
			System.out.println("--- car Model dropdown -- "+ FindADealerPageActions.IsDealerCarModelDropDownDiaplayedOrNot());
		}
	}
	
	@When("DealerCarMake dropdown is {string}")
	public void dealer_car_make_dropdown_is(String dealerCarMake) throws InterruptedException {
		FindADealerPageActions.IsDealerCarMakeDropDown(dealerCarMake);
		System.out.println("---- car Make -- "+ dealerCarMake);
		Thread.sleep(3000);
	}
	
}
