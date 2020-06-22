Feature: Application Login



@SmokeTest
Scenario: Net Banking Login
Given User is on Net Banking page
When User logins with username "usr1" and password "pwd1"
Then Net Banking Main page is displayed
And Cards diplayed are "true"
