Feature: E2E scenario

  Scenario: End-to-End scenario and download an invoice
    Given the user is on the website
    And the user is on login page
    And the user navigates to products page to add products
    And the user is on cart page
    And the user clicks on proceed to checkout
    And the user clicks on place order
    And the user enters his payment information
    And the user clicks on pay and confirm order
    And the user clicks on download invoice
    And the user clicks on continue
    When the user clicks on logout
    Then The login page will appear