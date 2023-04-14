@prod
Feature: Login Feature - Production
  In order to perform successful login
  As a user
  I have to enter correct username and password

  Scenario Outline: Login to Facebook Website as a user on Production
    Given user navigates to Facebook website
    When user validates the Homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user validates captcha image 
    And user clicks on the signin button
    Then user "shouldbe" succesfully logged in 

    Examples: 
      | username | password |
      | valid    | invalid  |
      | invalid  | invalid  |
      | valid    | invalid  |
      | invalid  | valid    |
