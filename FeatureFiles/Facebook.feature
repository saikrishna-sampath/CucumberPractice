#Author: Sai Krishna S, duddosai@gmail.com
#Keywords Summary : Feature file for facebook
#Feature: 
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
Feature: Facebook login feature
  This feature file is used for testing the login feature of Facebook

  @tag1
  Scenario: Test login feature of Facebook
    Given The user is in facebook login page
    When User enters a valid login username and password and clicks submit button
    Then User lands in facebook home page
