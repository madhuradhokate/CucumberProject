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
@Everthing
Feature: Login Functionality
 
    @smoke @regression
    Scenario: Login using valid userid
    Given username and password field should be present on the landing page
    When I enter valid user credentials on the website
    Then I should be able to login status 200

    @integration 
    Scenario: Login using invalid userid
    Given username and password field should be present on the landing page
    When I enter invalid userid on the website
    Then I should not be able to login status 401
    
    @regression
    Scenario: Login using invalid password
    Given username and password field should be present on the landing page
    When I enter invalid password on the website
    Then I should not be able to login status 401
    
    
    