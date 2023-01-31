#Author: Sayan
Feature: sharing candies

  Scenario Outline: sharing candies with friends
    Given sri has <qty> number of chocolates
    When she shares <shareqty> with her friends
    Then she is left with <leftover> chocolates

    Examples: 
      | qty | shareqty | leftover |
      |  99 |        5 |        5 |
      |   9 |        2 |        6 |
      | 100 |       20 |       80 |
