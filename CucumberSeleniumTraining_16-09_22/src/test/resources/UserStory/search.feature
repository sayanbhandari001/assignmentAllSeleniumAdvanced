Feature: Google search Feature

  Scenario: 
    	Finding some mobile on google page

    Given I am on the google search page
    When I search for "mobile"
    Then The page title should start with "mobile"
