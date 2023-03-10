Feature: Page navigation links

  Background:
    Given I am on the login page YM
    And I login as a librarian YM

  Scenario: Go to users page
    When I click on Users module
    Then Users page should be displayed

  Scenario: Go to books page
    When I click on Books module
    Then Books page should be displayed

  Scenario: Go to dashboard page
    And I click on Books module
    When I click on Dashboard link YM
    Then Dashboard page should be displayed