Feature: Check home Page functionality

  Background: user is logged in application
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page

  Scenario: Verify Logout link
    When user click on profile link
    Then Logout link should be displayed

  Scenario: Verify buzz module
    When user clicks on Buzz module
    Then Buzz dashboard should be displayed
