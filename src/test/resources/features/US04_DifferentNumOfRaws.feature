Feature: Manage different number of raws
  @US04
  Scenario Outline: Show records for <count> option

    Given I am on the login page NO
    And I login as a librarian NO
    And I click on "Users" link NO
    When I select Show <count> record
    Then show record value should be <count>
    And the users table must display <count> record

    Examples:
      | count |
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |



