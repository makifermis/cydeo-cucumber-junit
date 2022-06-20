Feature: DDT example with CloudTables
  Scenario: Adding one person
    Given User is on cloudTables homepage
    When User clicks on New button
    When User enters "firstname" to firstname field
    And User enters "lastname" to lastname field
    And User enters "position" to position field
    And User enters "salary" to salary field
    And User clicks on create button
    Then User should be able to find person at the search box

    # turn this scenario into DDT format with 4-5 person (scenario outline)