@smoke
Feature: invalid Registration Feature
Scenario: Creating new account so I can not login using invalid data
Given : User CChange Currency & navigate to register page
When :Selecting GGender
And :Filling FFirst name
And :Leaving Last Name without Filling
And :Selecting DDate of birth d-m-y
And :Filling EEmail
And :Filling CCompany name
And :Selecting NNewsletter
And : Filling PPassword
And :Filling CConfirm Password the same to Password Field
And :Clicking on RRegister Button
Then :Error Message of Registration will appear that Last name is required.
  And :Filling LLast Name
  And : Filling Confirm Password NOT the same to Password Field
  And :Clicking on RRRegister Button
  Then :Error Message of Registration will appear that Password do not match.