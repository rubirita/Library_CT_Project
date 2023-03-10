@US05
Feature: Search functionality on the users page
  User story 05 : As I user, I should be able to search value in the User page.

  Background:
    Given I am on the login pageUS05
    And I login as a librarianUS05
    And I click on Users link

  Scenario: Search accuracy
    When i search for "test"
    Then table should contain rows with "test"

  Scenario: Table columns names
    Then table should have following column names:
      | Actions |
      | User ID |
      | Email   |
      | Group   |
      | Status  |

