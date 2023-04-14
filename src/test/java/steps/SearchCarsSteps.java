package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import pages.actions.CarsSearchResultPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions CarsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions CarsSearchPageActions = new CarsSearchPageActions();
	CarsSearchResultPageActions CarsSearchResultPageActions = new CarsSearchResultPageActions();

	@Given("I am on the HomePage {string} of CarsGuide website")
	public void i_am_on_the_home_page_of_cars_guide_website(String websiteUrl) {
	    SeleniumDriver.openPage(websiteUrl);
	}

	@When("I move to menu")
	public void i_move_to_menu(List<String> list) {
	    //I want to move to menu  "buy + sell"  
		String menuItem = list.get(1);
		CarsGuideHomePageActions.moveToBuyAndSellMenu();		
	}

	@And("click on {string}")
	public void click_on(String searchCar) {
		System.out.println("Current Page - " + searchCar + "--url--"+SeleniumDriver.getDriver().getCurrentUrl());
		CarsGuideHomePageActions.clickOnSearchCars();
	}

	@And("select CarMake as {string} from AnyMake dropdown")
	public void select_car_make_as_from_any_make_dropdown(String carBrand) throws InterruptedException {
		Thread.sleep(5000);
		CarsSearchPageActions.selectCarMakeDropDown(carBrand);
	}
	
	@When("select CarModel as {string} from AnyModel dropdown")
	public void select_car_model_as_from_any_model_dropdown(String carModel) {
		CarsSearchPageActions.selectCarModelDropDown(carModel);
	}

	@And("select Location as {string} from AnyLocation dropdown")
	public void select_location_as_from_any_location_dropdown(String carLocation) {
		CarsSearchPageActions.selectCarLocationDropDown(carLocation);
	}

	@And("select Price as {string} from Price dropdown")
	public void select_price_as_from_price_dropdown(String carPrice) {
		CarsSearchPageActions.selectCarPriceToDropDown(carPrice);
	}

	@And("click on Find_My_Next_Car button")
	public void click_on_find_my_next_car_button() {
		System.out.println("Page1 ---"+SeleniumDriver.getDriver().getCurrentUrl());
		CarsSearchPageActions.clickFindMyNextCarButton();
	}

	@Then("I should see the list of searched cars")
	public void i_should_see_the_list_of_searched_cars() {
	    System.out.println("Cars List found!");
	    System.out.println("Page2 ---"+SeleniumDriver.getDriver().getCurrentUrl());
	}

	@And("the page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {
	    
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println("Search Cars Page Title -actual- "+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	
}
