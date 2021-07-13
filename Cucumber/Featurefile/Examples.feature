Feature: Validate an php travels personalinformation page
  
#Scenario: Validate the php travels personalinformation page with valid data
#Given user enter with open browser as chromdriver
#Then user enter with url as https://phptravels.org/register.php
#And users enter with valides credentials as karuna
#When users enter  with valides lastname as karan
#And user enter with emailid as karunaeee
#Then user enter with mobileno as 9500
    

  
Scenario Outline: Validate the php travels personalinformation page with valid data
Given user enter with open browser as "<BROWSER>"
Then user enter with url as "<URL>"
And users enter with valides credentials as "<FIRSTNAME>" 
When users enter  with valides lastname as "<LASTNAME>"
And user enter with emailid as "<EMAILID>"
Then user enter with mobileno as "<MOBILNO>"

Examples: 
| BROWSER     | URL                                  | FIRSTNAME |LASTNAME|EMAILID  | MOBILNO|
| CHROMDRIVER | https://phptravels.org/register.php  |Karuna     |karan   |karunaeee|9500    |
| CHROMDRIVER | https://phptravels.org/register.php  |abc        |dfv     |karunaesd|8825    |  
| CHROMDRIVER | https://phptravels.org/register.php  |kjg        |mno     |murthycha|5555    |

