@wip
Feature: Search new users dialog
  User Story 08, As a user, I should be able to search users by ID


    Background:
    Given I am on the login page
    And I log in using "librarian21@library" and "libraryUser"



  Scenario Outline: verify user information
     And I click "Users" Link
     When I search for "7482"
     Then Table should contain "userID", "<fullName>", "email>" data
     Examples:

     | userID   | 7482                  |
     | fullName | Test-Michelle          |
     | email    | test-michelle@test.com |

    #There is a bug it always shows first ID number in the user list
