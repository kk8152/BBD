Feature: Validate php travels registor page
  
Scenario: Validate php travels registor page with valid data
Given user open browser as "chromdriver"
Then user enter the url as "https://phptravels.org/register.php"
And users enter the valide credentials as "karuna"
When users enter the valide lastname as "karan"
And enter emailid as "karunaeee"
Then user enter mobileno as "9500"