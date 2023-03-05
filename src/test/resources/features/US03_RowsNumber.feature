Feature: manage user info table

  @US03
  Scenario: Change number of rows in Users page
    Given I am on the login page
    And I login as a librarian
    And I click on "Users" link
    When I select Show 50 records
    Then show records value should be 50
    And the users table must display 50 records