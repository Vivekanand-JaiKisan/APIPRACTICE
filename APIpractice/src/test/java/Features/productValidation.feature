Feature: Validating Add product API's

  Scenario: Here Validating login is working properly using loginAPI
    Given Here Login using creditionals 
    When user calls "LoginAPI" with "POST" http request
    Then the API call is success with status code 200
    And "message" in response body is "Login Successfully"
    
  Scenario:Here Validating 


