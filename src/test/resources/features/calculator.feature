Feature: Calculator Tests

  Background:
    Given User is on calculator page

  Scenario: Test Adding
    When User clicks "5" on calculator
    And User clicks "+" on calculator
    And User clicks "5" on calculator
    Then result "10" should be seen


  Scenario: Test Subtracting
    When User clicks "9" on calculator
    And User clicks "–" on calculator
    And User clicks "5" on calculator
    Then result "4" should be seen

  @calc
  Scenario Outline: Testing whole functionality
    When User clicks "<button1>" on calculator
    And User clicks "<operator>" on calculator
    And User clicks "<button2>" on calculator
    Then result "<result>" should be seen
    Examples:
      | button1 | operator | button2 | result |
      | 5       | +        | 5       | 10     |
      | 3       | ×       | 6       | 18     |
      | 6       | /        | 2       | 3      |
