Feature: LoginFeature
  This feature deals with the login functionality of the applications

  Scenario: Login with correct username and password
    Given I navigate to the login page
    When I enter username as "santosh.tallapudi@gmail.com"
    And I enter password as "Password1234"
    Then I should be able to see the home page



