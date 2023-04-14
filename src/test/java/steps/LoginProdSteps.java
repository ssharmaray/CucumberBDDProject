package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginProdSteps {


	@And("user validates captcha image")
	public void user_validates_captcha_image() {
		System.out.println("@And -- user validates captcha image");
	}
	
	@Then("user enters firstname and lastname")
	public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
	   
//		List<List<String>> data = dataTable.asLists();
//		
//		System.out.println("First name is :" + data.get(0).get(0) + ", Last name is :" + data.get(0).get(1));
//		System.out.println("First name is :" + data.get(1).get(0) + ", Last name is :" + data.get(1).get(1));
		
//		List<Map<String, String>> map = dataTable.asMaps();
//		System.out.println("First name is :" + map.get(0).get("FirstName") + ", Last name is :" + map.get(0).get("LastName"));
//		System.out.println("First name is :" + map.get(1).get("FirstName") + ", Last name is :" + map.get(1).get("LastName"));
		
		for(Map<String, String> data:dataTable.asMaps(String.class,String.class))
		{
			System.out.println("First name is :" + data.get("FirstName") + ", Last name is :" + data.get("LastName"));
		}
		
	}
	
	@And("user clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		System.out.println("@And -- user clicks on the signin button");
	}
	
	@Then("user {string} succesfully logged in")
	public void user_succesfully_logged_in(String shouldbeornot) {
		System.out.println("@Then -- user "+shouldbeornot+" succesfully logged in ");
		System.out.println();
	}
}
