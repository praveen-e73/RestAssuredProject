
#@tag
Feature: Title of your feature
  #I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I enter the car
    When I put the keys in
    And turn on the keys
    Then it should start


  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with '<name>'
    When I check for the '<value>' in step
    Then I verify the '<status>' in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
