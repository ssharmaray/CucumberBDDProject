package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchResultPageActions;
import pages.actions.NewCarsSearchPageActions;
import utils.SeleniumDriver;

public class NewCarsSearchSteps {
	
	CarsGuideHomePageActions CarsGuideHomePageActions = new CarsGuideHomePageActions();
	NewCarsSearchPageActions NewCarsSearchPageActions = new NewCarsSearchPageActions();
	CarsSearchResultPageActions CarsSearchResultPageActions = new CarsSearchResultPageActions();

	@And("click on {string} _newCar")
	public void click_on__new_car(String string) {
	    
		CarsGuideHomePageActions.clickOnNewCar();
	}
	
	@And("select CarMake_newCar as {string} from AnyMake dropdown")
	public void select_car_make_new_car_as_from_any_make_dropdown(String newCarBrand) throws InterruptedException {
		Thread.sleep(5000);
		NewCarsSearchPageActions.selectNewCarMakeDropDown(newCarBrand);
	}
	
	@And("select CarModel_newCar as {string} from AnyModel dropdown")
	public void select_car_model_new_car_as_from_any_model_dropdown(String newCarModel) {
		NewCarsSearchPageActions.selectNewCarModelDropDown(newCarModel);
	}
	
	@And("select Location_newCar as {string} from AnyLocation dropdown")
	public void select_location_new_car_as_from_any_location_dropdown(String newCarLocation) {
		NewCarsSearchPageActions.selectNewCarLocationDropDown(newCarLocation);
	}
	
	@And("select Price_newCar as {string} from Price dropdown")
	public void select_price_new_car_as_from_price_dropdown(String newCarPrice) {
		NewCarsSearchPageActions.selectNewCarPriceToDropDown(newCarPrice);
	}
	
	@And("click on Find_My_Next_Car button _newCar")
	public void click_on_find_my_next_car_button__new_car() {
		NewCarsSearchPageActions.clickFindMyNextCarButton_newCar();
	}
	
	@Then("I should see the list of searched cars _newCar")
	public void i_should_see_the_list_of_searched_cars__new_car() {
	    
	}
	
	@And("the page title should be {string} _newCar")
	public void the_page_title_should_be__new_car(String expectedTitle_usedCar) {
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println("Search Cars Page Title -actual- "+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle_usedCar);
	}
	
	//this method is for the Negative Scenario
	@And("the error message should be {string} _newCar")
	public void the_error_message_should_be__new_car(String expectedSearchResutMessage) {
		String actualSearchResutMessage = CarsSearchResultPageActions.searchResultErrorMessage();
		Assert.assertTrue(actualSearchResutMessage.contains(expectedSearchResutMessage));
	}

}
