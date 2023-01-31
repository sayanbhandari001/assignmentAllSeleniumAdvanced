Feature: TestMeApp Login Feature
  In order to login to TestMeApp, Samantha must register herself to TestMeApp application

  Scenario: Successfull login
    
    Given Samantha opens chrome browser and opens the url "https://lkmdemoaut.accenture.com/TestMeApp/login.htm"
    When She enters "mercury" as username
    And She enters "test1234" as password
    And She clicks on Login button
    Then TestMeApp takes the samantha to homepage of the TestMeApp

