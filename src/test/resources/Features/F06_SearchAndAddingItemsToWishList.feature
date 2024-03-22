@smoke
Feature: Verification of Working Search Field and WishList
  Scenario: Using Search Field to Search on phone
    Given : User Redirected to home page after successful login
    When : User Fill Search Field by phone
    And : Click on Search Button
    Then : User Will redirected to Search Page
    And : User Clicks on Add to WishList for the first Item
    Then : Message will appear as the addition to WishList happen successfully
    And : User Clicks On Message Link WishList
    Then : User is redirected to WishList Page
    And : User Clicks on logo to go to Home Page
    And : User Clicks on WishList Link
    Then : Added Item Is Placed In WishList
    And :User Clicks on Logout
    Then : User is Logged out

