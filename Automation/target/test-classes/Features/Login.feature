Feature: Application Login

@SmokeTest
Scenario: Net Banking Login
Given User is on Net Banking page
When User logins with username "usr1" and password "pwd1"
Then Net Banking Main page is displayed
And Cards diplayed are "true"

@Regtest
Scenario: Net Banking Login
Given User is on Net Banking page
When User logins with username "usr2" and password "pwd2"
Then Net Banking Main page is displayed
And Cards diplayed are "false"

@Regtest
Scenario: Net Banking Login
Given User is on Net Banking page
When User signs up with following details
| Sahil | Patni | sahilpatni12@gmail.com |
Then Net Banking Main page is displayed
And Cards diplayed are "false"

@Regtest
Scenario Outline: Net Banking Login
Given User is on Net Banking page
When User signs up with <username> and <password>
Then Net Banking Main page is displayed
And Cards diplayed are "True"

Examples:
|username|password|
|usr3    |pwd3    |
|usr4    |pwd4    |
|usr5    |pwd5    |
