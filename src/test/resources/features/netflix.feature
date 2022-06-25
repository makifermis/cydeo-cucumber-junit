Feature: Movie suggestion feature
  As a user I should be able to get movies according to my prefrences

  Scenario: Movie search
    Given I like "actions"
    And I like "drama"
    And I like "cartoon"
    And I like "adventure"
    When I go to homepage
    Then I should get right recommendation

  Scenario: Movie search dataTable list
    Given I like
      | actions   |
      | drama     |
      | cartoon   |
      | adventure |
    When I go to homepage
    Then I should get right recommendation

  Scenario: Movie search dataTable Map
    Given I like below favorite movei with certain type
      | actions   | John Wick   |
      | drama     | Titanic     |
      | cartoon   | Tom&Jerry   |
      | adventure | Tomb Raider |
    When I go to homepage
    Then I should get right recommendation
