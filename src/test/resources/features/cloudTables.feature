Feature: DDT example with CloudTables


  Scenario: Adding one person
    Given User is on cloudTables homepage
    When User clicks on New button
    When User enters "Jack" to firstname field
    And User enters "Oscar" to lastname field
    And User enters "Accountant" to position field
    And User enters "120000" to salary field
    And User clicks on create button
    Then User should be able to find "Jack Oscar" at the search box
    And User deletes the person created

  @wip
  Scenario Outline: Adding one person
    Given User is on cloudTables homepage
    When User clicks on New button
    When User enters "<name>" to firstname field
    And User enters "<lastname>" to lastname field
    And User enters "<position>" to position field
    And User enters "<salary>" to salary field
    And User clicks on create button
    Then User should be able to find "<fullName>" at the search box
    And User deletes the person created

    Examples: People who are going to entered into table is as below
      | name | lastname | position               | salary | fullName     |
      | Mike | Tyson    | Software Engineer      | 140000 | Mike Tyson   |
      | Tom  | Table    | Sales Assistant        | 90000  | Tom Table    |
      | Mary | Angel    | Pre-Sales Support      | 110000 | Mary Angel   |
      | Jane | McKelly  | Integration Specialist | 120000 | Jane McKelly |
    # turn this scenario into DDT format with 4-5 person (scenario outline)
    # editor.datatables.net