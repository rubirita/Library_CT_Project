Feature: Show records functionality
  User Story2: As a user, I want to see users information in different records.

  @usersRecords
  Scenario: verify default values in Users page
    Given I am on the login page
    And I login as a librarian_AS
    When I click on "Users" link_AS
    Then show records default value should be 10
    And show records should have following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |

