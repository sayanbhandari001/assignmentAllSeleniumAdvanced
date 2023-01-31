#Author: Sayan Bhandari
Feature: user login to facebook
Scenario: successful login to facebook site

Given John is on the fb login page
When he provides valid credentials
Then he shall be able to view the fb wall