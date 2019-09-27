Feature: login
Scenario Outline: test
Given user not logged
When user perform loggin using <username> and <password>
Then logged in
Examples:
|username||password|
|asroopa97||ash123|
|lalitha||Password123|
