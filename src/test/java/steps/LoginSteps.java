package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user navigates to Facebook website")
	public void user_navigates_to_facebook_website() {
	    System.out.println("@Given -- user navigates to Facebook website");
	}

	@When("user validates the Homepage title")
	public void user_validates_the_Homepage_title() {
		System.out.println("@When -- user validates the Homepage title");
	}

	@And("user enters {string} username")
	public void user_enters_username(String username) {
		System.out.println("@And -- user enters "+ username +" username");
	}

	@And("user enters {string} password")
	public void user_enters_password(String password) {
		System.out.println("@And -- user enters "+ password +" password");
	}

//	@And("user select the age category")
//	public void user_select_the_age_category(List<String> list) {
//		System.out.println("@And -- user select the age category: "+ list.get(1));
//		
//	}
	
	@And("user select the age category")
	public void user_select_the_age_category(DataTable table) {
		
		List<Map<String,String>> data = table.asMaps(String.class,String.class);
		System.out.println("@And -- user select the age category: "+ data.get(0).get("Age") + " -- from location : "+data.get(0).get("Location"));
		
	}
	
	@Then("user {string} be able to succesfully log in")
	public void user_be_able_to_succesfully_log_in(String logintype) {
		System.out.println("@Then -- user "+logintype+" be able to succesfully log in");
		System.out.println();
	}
}
