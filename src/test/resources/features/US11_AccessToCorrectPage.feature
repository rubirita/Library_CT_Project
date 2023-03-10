Feature: Login same line


  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian12@library" and "libraryUser"
    Then dashboard page should be displayed


  Scenario: Login as student same line
    Given I am on the login page
    When I login using "student12@library" and "libraryUser" NA
    Then books page should be displayed