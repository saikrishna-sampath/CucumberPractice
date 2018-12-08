#Author: Sai Krishna S, duddosai@gmail.com
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
Feature: Test the demo registration page
  This template is used to test the demo registration page with more inputs

  @tag2
  Scenario Outline: Title of your scenario outline
    Given The user is in demo resgitration page
    When The user enters all valid details "<FirstName>", "<LastName>","<Address>","<EmailId>","<Phone>","<Gender>","<Hobbies>","<Language>","<Skills>","<Country>","<DOB>","<Password>","<SonfirmPassword>"
    Then Success message is shown after successful registration

    Examples: 
      | FirstName | LastName  | Address                 | EmailId            | Phone      | Gender | Hobbies         | Language         | Skills  | Country | DOB        | Password    | ConfirmPassword |
      | Sai       | Krishna S | Chromepet, Chennai - 44 | duddosai@gmail.com | 9551399471 | Male   | Cricket, Movies | Czech, Bulgarian | APIs    | Austria | 22-11-1993 | Sai@1993    | Sai@1993        |
      | Satish    | KKumar R  | Perambur, Chennai - 44  | satichl@gmail.com  | 9876543210 | Female   | Cricket, Movies | Danish, Croatian | Android | Bahrain | 05-05-1993 | Satish@1993 | Satish@1993     |
