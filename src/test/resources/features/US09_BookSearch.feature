Feature: books search
@US09
  Scenario: Verify book search results
    Given I am on the login page
    And the user logged in as "student"
    When I navigate to "Books" page
    And I search for the "The Goldfinch"
    Then books table should contain results matching The Goldfinch

      | ISBN     | 387927210592  |
      | Name     | The Goldfinch |
      | Author   | Donna Tartt   |
      | Category | Fantasy       |
      | Year     | 2013          |
