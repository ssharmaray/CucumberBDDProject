@Used-Search-Cars
Feature: Acceptance testing to validate Used Search cars page is working fine.
  In order to validate that
  the search cars page is working fine
  we will do the acceptance testing
  
  Background:
  	Given I am on the HomePage "https://www.carsguide.com.au" of CarsGuide website 

  @Used-Search-Cars-Positive
  Scenario: Validate Used Search Cars page    
    When I move to menu
      | Menu            |
      | buy + sell      |
      
    And click on "Used" usedCar
    And select CarMake_usedCar as "Kia" from AnyMake dropdown
    And select CarModel_usedCar as "Rio" from AnyModel dropdown
    And select Location_usedCar as "NSW - Sydney" from AnyLocation dropdown
    And select Price_usedCar as "$1,000" from Price dropdown
    And click on Find_My_Next_Car_usedCar button
    Then I should see the list of searched cars_usedCar
    And the page title should be "Used Kia Rio Under 1000 for Sale Sydney NSW - Second Hand Kia Rio Under $1k in Sydney | carsguide" _usedCar
    
    