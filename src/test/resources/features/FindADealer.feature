@Find-a-Dealer
Feature: Acceptance testing to validate Find a Dealer page is working fine.
  In order to validate that
  the Find a Dealer page is working fine
  we will do the acceptance testing

  Background: 
    Given I am on the HomePage "https://www.carsguide.com.au" of CarsGuide website
    When I move to menu
      | Menu       |
      | buy + sell |
    And click on "Find a Dealer" _find_a_dealer
    Then the Find a Dealer page title should be "Car Dealers & Car Yards | carsguide"

  @Find-a-Dealer-Positive
  Scenario: Validate Find a Dealer page
    When select DealerCarMake as "SKODA" from AnyMake dropdown
    And select DealerLocation as "ACT - All" from AnyLocation dropdown
    #And select DealerModel as "Any Model" from AnyModel dropdown
    And choose Service Centres checkbox as "true"
    And choose Parts checkbox as "false"
    And click on Find Dealers button
    Then I should see the list_of_dealers
    And the dealer page title should be "SKODA Service ACT | carsguide"

  Scenario: Validate the carModel dropdown is present when the carMake is selected
    When DealerCarMake dropdown is "SKODA"
    Then DealerCarModel dropdown "appears"

  @Find-a-Dealer-Negative
  Scenario: Validate correct error message is displayed if dealer is not found
    When select DealerCarMake as "BYD" from AnyMake dropdown
    And select DealerLocation as "   NSW - Riverina" from AnyLocation dropdown
    And choose Service Centres checkbox as "true"
    And choose Parts checkbox as "false"
    And click on Find Dealers button
    Then I should see the list_of_dealers
    And the dealer page title should be "BYD Service Riverina, NSW | carsguide"
    And the error message "Sorry, your search returned no results." is displayed

  Scenario: Validate the carModel dropdown is not present when the carMake is not selected
    When DealerCarMake dropdown is "Any Make"
    Then DealerCarModel dropdown "does not appear"
