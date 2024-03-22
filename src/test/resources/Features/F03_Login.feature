@smoke
  Feature: Verification Of Login Feature
    Scenario: Login With Invalid Account
      Given : Redirected to HHome Page then to Login Page
      When : User FFill Registered Email Field
      And : User Fill Wrong Registered Password
      And : Click On RRemember me Check Box
      And : Click On LLogin Button
      Then : Error Message
    Scenario: Login With Registered Account
      Given : Redirected to Home Page then to Login Page
      When : User Fill Registered Email Field
      And : User Fill Registered Password
      And : Click On Remember me Check Box
      And : Click On Login Button
      Then : Login Successfully