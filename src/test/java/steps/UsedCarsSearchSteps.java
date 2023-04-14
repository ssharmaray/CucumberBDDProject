package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;
import utils.SeleniumDriver;

public class UsedCarsSearchSteps {

	CarsGuideHomePageActions CarsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarsSearchPageActions UsedCarsSearchPageActions = new UsedCarsSearchPageActions();

	@And("click on {string} usedCar")
	public void click_on_used_car(String string) {
		CarsGuideHomePageActions.clickOnUsedCars();
	}
	
	@And("select CarMake_usedCar as {string} from AnyMake dropdown")
	public void select_car_make_used_car_as_from_any_make_dropdown(String usedCarBrand) throws InterruptedException {
		Thread.sleep(5000);
		UsedCarsSearchPageActions.selectUsedCarMakeDropDown(usedCarBrand);
	}
	
	@And("select CarModel_usedCar as {string} from AnyModel dropdown")
	public void select_car_model_used_car_as_from_any_model_dropdown(String usedCarModel) {
		UsedCarsSearchPageActions.selectUsedCarModelDropDown(usedCarModel);
	}
	
	@And("select Location_usedCar as {string} from AnyLocation dropdown")
	public void select_location_used_car_as_from_any_location_dropdown(String usedCarLocation) {
		UsedCarsSearchPageActions.selectUsedCarLocationDropDown(usedCarLocation);
	}
	
	@And("select Price_usedCar as {string} from Price dropdown")
	public void select_price_used_car_as_from_price_dropdown(String usedCarPrice) {
		UsedCarsSearchPageActions.selectUsedCarPriceToDropDown(usedCarPrice);
	}
	
	@And("click on Find_My_Next_Car_usedCar button")
	public void click_on_find_my_next_car_used_car_button() {
		System.out.println("Page3 ---"+SeleniumDriver.getDriver().getCurrentUrl());
		UsedCarsSearchPageActions.clickFindMyNextCarButton_UsedCar();
	}
	
	@Then("I should see the list of searched cars_usedCar")
	public void i_should_see_the_list_of_searched_cars_used_car() {
	    
	}
	
	@And("the page title should be {string} _usedCar")
	public void the_page_title_should_be__used_car(String expectedTitle) {
	    
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println("Search Cars Page Title -actual- "+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
