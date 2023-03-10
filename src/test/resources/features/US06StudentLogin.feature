@wip
Feature: User valid login
  Scenario Outline: Verify user information email
    Given I am on the login page
    When I login using "<email>" and "<password>"
    Then account holder name should be "<name>"

    @students

    Examples:
      | email             | password    | name            |
      | student27@library | libraryUser | Test Student 27 |
      | student28@library | libraryUser | Test Student 28 |
      | student29@library | libraryUser | Test Student 29 |
      | student30@library | libraryUser | Test Student 30 |