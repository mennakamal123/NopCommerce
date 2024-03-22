@smoke
  Feature: Valid Registration Feature
      Scenario: Creating new account so I can login using valid data
      Given : User Change Currency & navigate to register page
      When :Selecting Gender
      And :Filling First name
      And :Filling Last Name
      And :Selecting Date of birth d-m-y
      And :Filling Email
      And :Filling Company name
      And :Selecting Newsletter
      And : Filling Password
      And :Filling Confirm Password the same to Password Field
      And :Clicking on Register Button
      Then :Success Message of Registration will appear

