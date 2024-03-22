@smoke
  Feature: Verification of Working Search Field
    Scenario: Using Search Field to Search on Laptops
      Given : User redirected to home page after successful login
      When : User fill Search Field by Laptop
      And : Click On Search Button
      Then : User will redirected to Search Page
      And : User Clicks on Add to cart for the first Item
      Then : Message will appear as the addition to cart happen successfully
      And : User Clicks On Message Link Shopping Cart
      Then : User is redirected to Shopping Cart Page
      And : User Clicks on Logo to go to Home Page
      And : User Clicks on Shopping Cart Link
      Then : Added Item Is Placed On Cart

