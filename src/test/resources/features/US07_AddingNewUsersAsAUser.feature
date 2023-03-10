Feature: Add new users dialog

  @VerifyThePlaceholders

  Scenario: Placeholder tests
    Given I am on the login page
    And I login using following credentials:
      | email    | librarian21@library |
      | password | libraryUser         |

    And I click on "Users" module
    When I click on the Add Users
    Then dialog fields must have matching placeholder

      | fullname | Full Name |
      | email    | Email     |
      | password | Password  |
      | address  | null      |
