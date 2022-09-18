
Feature: Create new account

  Scenario: Creating a new account with non previously registered email
    Given the user is on the website
    When the user enters an email that does not previously registered with
    Then the user enters a registration form
    And the user should be registered successfully

  Scenario: Creating a new account with pre-registered email
    Given the user is on the website
    When the user enters a pre-registered email
    Then an error message must appear

