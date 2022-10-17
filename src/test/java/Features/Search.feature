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

Feature: Way2Automation Search
  
   Scenario: Search Course
   Given Search field should br present  on the Way2Automation website
   When I search for course "cucumber BDD for Selenium" having price 1000
   Then Course "cucumber BDD for Selenium & Appium With Live Project" should be displayed
   
   Scenario: Search automation Course
   Given Search field should br present  on the selenium website
   When I search for course "Appium" having price 1500
   Then Course "Appium" should be displayed