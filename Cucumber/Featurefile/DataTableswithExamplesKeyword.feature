Feature: validate php travels Billing Address 

Scenario Outline: validate php travels Billing Address with valid data
Given user will enter the url
When user open enter the browser
Then user should be enter the  "<companyname>"
And user could be enter the "<address>"

Examples: 
| companyname  | address | 
| Vmetry       | Guindy  |

##Simple explanation, more examples in Example&Expractice