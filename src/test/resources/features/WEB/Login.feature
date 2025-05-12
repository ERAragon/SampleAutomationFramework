Feature: Login Feature

  @TestAutoWEB
  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters username "student" and password "Password123"
    Then user should be redirected to the homepage
    When the user clicks on logout button
    Then user should be redirected to loginpage