Feature: Login Feature

  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters username "student" and password "Password123"
    Then user should be redirected to the homepage
    When the user clicks on logout button
    Then user should be redirected to loginpage

  Scenario: Verify GET API returns 200 status
    When the user sends a GET request to "https://jsonplaceholder.typicode.com/posts/1"
    Then the API response status code should be 200