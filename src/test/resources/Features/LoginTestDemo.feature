Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters valid <username> and <password>
    And hits enter
    Then user is navigated to home page

    Examples: 
      | username | password |
      | nareshit | nareshit |
      | sushanth | sushanth |
      | ram      | siya     |
