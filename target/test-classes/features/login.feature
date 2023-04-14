@bvt
Feature: Login Feature
  In order to perform successful login
  As a user
  I have to enter correct username and password

  Scenario Outline: Login to Facebook Website
    Given user navigates to Facebook website
    When user validates the Homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user select the age category
      | Age      | Location |
      | below 18 | India    |
      | above 18 | USA      |
    Then user "<logintype>" be able to succesfully log in

    Examples: 
      | username | password | logintype |
      | valid    | valid    | shouldbe  |
      | invalid  | invalid  | shouldnot |
      | valid    | invalid  | shouldnot |
      | invalid  | valid    | shouldnot |
