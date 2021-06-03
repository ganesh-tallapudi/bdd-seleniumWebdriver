Feature: Place Order and Update Personal Info Feature
  This feature deals with the login functionality of the applications

  Background: Login with correct username and password
    Given I navigate to the login page
    When I enter username as "santosh.tallapudi@gmail.com"
    And I enter password as "Password1234"
    And I clicked on Login Button
    Then I should be able to see the home page


  Scenario:
    When I click on Tshirt tab
    And selected the Item
    And Added Item to Cart
    And Proceed to Checkout across pages and Confirm the Order
    Then I should see order is successfully placed


  Scenario:
    When I should click on user profile page
    And click on personal information
    And updated firstName with randomString
    And click on Save
    Then should see a message on the screen with "Your personal information has been successfully updated."




