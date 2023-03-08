@wip
Feature: Search new users dialog
  User Story 08, As a user, I should be able to search users by ID


    Background:
    Given I am on the login page
    And I log in using "librarian21@library" and "libraryUser"



  Scenario Outline: verify user information
     And I click "Users" Link
     When I search for "7587"
     Then Table should contain "<userID>", "<fullName>", "<email>" data
      Examples:
        | userID | fullName         | email                           |
        | 7587   | Asuncion Pfeffer | OraliaDaugherty2345@library.com |


    #There is a bug in the code,it always shows first ID number in the user list
