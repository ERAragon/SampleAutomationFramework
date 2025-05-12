Feature: Get Feature API

@TestAutoAPI
  Scenario: Verify GET API returns 200 status
    When the user sends a GET request to "endpoint"
    Then the API response status code should be 200