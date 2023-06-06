#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature

  @tag1
  Scenario Outline: Login with Multiple User
    Given I have opened site   "https://www.saucedemo.com/"
    When I  enter <Username>
    And I enter <Password>
    And I click the login button
    Then I validate new url is launched

    Examples: 
      | Username       | Password      |
      | standard_user1 | secret_sauce1 |
      | standard_user2 | secret_sauce2 |
      | standard_user  | secret_sauce  |
