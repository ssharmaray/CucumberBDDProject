@New-Search-Cars
Feature: Acceptance testing to validate New Search cars page is working fine.
  In order to validate that
  the search cars page is working fine
  we will do the acceptance testing

  @New-Search-Cars-Positive
  Scenario: Validate New Search Cars page
    Given I am on the HomePage "https://www.carsguide.com.au" of CarsGuide website
    When I move to menu
      | Menu            |
      | buy + sell      |
      
    And click on "New" _newCar
    And select CarMake_newCar as "Renault" from AnyMake dropdown
    And select CarModel_newCar as "Koleos" from AnyModel dropdown
    And select Location_newCar as "NSW - Hunter" from AnyLocation dropdown
    And select Price_newCar as "$2,500" from Price dropdown
    And click on Find_My_Next_Car button _newCar
    Then I should see the list of searched cars _newCar
    And the page title should be "New Renault Koleos Under 2500 for Sale Hunter NSW | carsguide" _newCar
    
    @New-Search-Cars-Negative
  Scenario: Validate correct error message is displayed if new car is not found
    Given I am on the HomePage "https://www.carsguide.com.au" of CarsGuide website
    When I move to menu
      | Menu            |
      | buy + sell      |
      
    And click on "New" _newCar
    And select CarMake_newCar as "Hyundai" from AnyMake dropdown
    And select CarModel_newCar as "Excel" from AnyModel dropdown
    And select Location_newCar as "NSW - Sydney" from AnyLocation dropdown
    And select Price_newCar as "$7,500" from Price dropdown
    And click on Find_My_Next_Car button _newCar
    Then I should see the list of searched cars _newCar
    And the page title should be "New Hyundai Excel Under 7500 for Sale Sydney NSW | carsguide" _newCar
    And the error message should be "There doesn't seem to be any cars that exactly match your criteria." _newCar