Feature: Login Action

 Scenario Outline: Successful Login with Valid Credentials
Given User is open the application
When User click on signin link
And User enters "<username>" and "<password>"
Then Message displayed Login Succesfully


   Examples:
   | username | password |
   | lalitha | password123 |
   | admin | password456 |