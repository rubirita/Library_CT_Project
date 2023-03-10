

Feature: Users table

  @US01
  Scenario: unique users ids
    Given I am on the login page
    And I login as a librarian MT
    When I click  on "Users" link MT
    Then Each user id should be unique