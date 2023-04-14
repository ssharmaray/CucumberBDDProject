@Search-Cars
Feature: Acceptance testing to validate Search cars page is working fine.
  In order to validate that
  the search cars page is working fine
  we will do the acceptance testing

  @Search-Cars-Positive
  Scenario: Validate Search Cars page
    Given I am on the HomePage "https://www.carsguide.com.au" of CarsGuide website
    When I move to menu
      | Menu            |
      | buy + sell      |
      | reviews         |
      | news            |
      | advice          |
      | pricing + specs |
      | guides          |
    And click on "Search Cars"
    And select CarMake as "BMW" from AnyMake dropdown
    And select CarModel as "1 Series" from AnyModel dropdown
    And select Location as "NSW - Sydney" from AnyLocation dropdown
    And select Price as "$1,000" from Price dropdown
    And click on Find_My_Next_Car button
    Then I should see the list of searched cars
    And the page title should be "Bmw 1 Series Under 1000 for Sale Sydney NSW | carsguide"
