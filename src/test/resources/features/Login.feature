Feature: Login in the App

  Background:
    Given the user is on Login tab

  Scenario Outline:
    Given the user is on the page
    When the user enters the "<Username>"
    And the user enters the "<Password>"
    And the user Clicks on Login button
    Then Profile page loads successfully

    Examples:
      | Username      | Password |
      | juanqwerty123 | Test     |


