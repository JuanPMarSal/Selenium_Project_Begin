@Test

Feature: Interaction with My Profile

  Background:
  Given the user is on Login tab
    When the user enters the "<Username>" and the "<Password>"
    And the user Clicks on Login button
    Then Profile page loads successfully

  Scenario Outline:



    Examples:
      | Username      | Password |
      | juanqwerty123 | Test     |


