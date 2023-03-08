Feature: User valid login
  Scenario Outline: Verify user information email
    Given I am on the login page
    When I login using "<email>" and "<password>"
    Then account holder name is librarian should be "<name>"

    @librarians

    Examples:
      | email               | password    | name              |
      | librarian13@library | libraryUser | Test Librarian 13 |
      | librarian14@library | libraryUser | Test Librarian 14 |
      | librarian15@library | libraryUser | Test Librarian 15 |
      | librarian16@library | libraryUser | Test Librarian 16 |
      | librarian21@library | libraryUser | Test Librarian 21 |
