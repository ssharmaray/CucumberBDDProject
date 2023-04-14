@Used-Search-Cars
Feature: Acceptance testing to validate the What Car Should I Buy page is working fine.
  In order to validate that
  the the What Car Should I Buy page is working fine
  we will do the acceptance testing
  
  Background: 
    Given I am on the HomePage "https://www.carsguide.com.au" of CarsGuide website
    When I move to menu
      | Menu       |
      | buy + sell |      

  @What-Car-Should-I-Buy-Positive
  Scenario: 
		When click on "What car should I buy?" _what_car_should_I_Buy
    Then the Find a Dealer page title should be "​What Car Should I Buy? | CarsGuide"
    And the page contains the following links
    |Header Links|
    |Commercial|
    |Convertible|
    |Coupe|
    |Hatchback|
    |People mover|
    |Sedan|
    |SUV|
    |Ute|
    |Wagon|
    |Car Advice|
    |Buyers Guide|
    |Buying tips|
    And click on "Commercial" _header_Link
    Then the "Commercial Vehicle Reviews | CarsGuide" page should open
    
    
    
    
  
 		