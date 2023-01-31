#Author:Sayan
@featuretag
Feature: demo of tags

  @uitag1
  Scenario: Bank payment Successfull
    Given Rakesh enters card details
    And Request OTP
    When OTP receives
    And Enters Proper OTP
    Then Payment successfull

  @uitag2
  Scenario: Bank payment failure
    Given Rakesh enters card details
    And Enters wrong OTP
    When OTP receives
    Then Payment failure

  @performance
  Scenario: Bank payment failure
    Given Rakesh enters card details
    And Waits for 10 mins
    When Payment page expires
    Then Payment failure

  @regression
  Scenario: Bank redirection page from bank merchant to bank failure
    Given Rakesh selects item in cart for payment
    And Selects Bank for payment
    When Payment page broken
    Then Payment failure
