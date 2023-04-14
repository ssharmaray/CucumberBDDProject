@datatable
Feature: Login Feature - Production
  In order to perform successful login in Production 
  As a user
  I have to enter correct username and password

  Scenario Outline: Login to Facebook Website as a user on Production
    Given user navigates to Facebook website
    When user validates the Homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user enters firstname and lastname
      | FirstName | LastName |
      | Smita     | Sharma   |
      | Siddhanth | Mandal   |
      | Suman     | Mandal   |
      | Prakriti  | Roy      |
    And user clicks on the signin button
   
