Feature: Validate php travels registor page

Scenario: Validate php travels registor page with valid data
Given user open browser as chromdriver
Then user enter url
And user enter firstname
When user enter lastname
And user enter emailid
Then user enter mobileno
