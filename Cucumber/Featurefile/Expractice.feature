Feature: Validate an php travels rgistor page and billing page
 
Scenario: Validate an php travels rgistor page and billing page with valid data
Given user open her there Browser as us Browser 
When user enter her the url as us https://phptravels.org/register.php
Then user enter her firstname as us Karuna
And user enter the lastname as us karan
Then user enter the emailId as us karunaeee
And user enter the mobileno as us 9500
Then user enter the companyname as us Vcentry
And user enter the address as us Adyar
When user enter the streetaddress as us Adyarsignal
And user enter the cityname as us Chennai
Then user enter the statename as us Tamilnadu
And user enter the postcode as us 600030 
Then user click how to select as us Google
##inthaa scenrio needed keedaiyathu just venumna vachugalam.Scienario ellama Scienario Outline
##madum vachu run pannigalam with help of Examples keyword..vinoth'na teachimg like this                                         

Scenario Outline: Validate an php travels rgistor page and billing page with valid data
Given user open her there Browser as us "<BROWSER>"
When user enter her the url as us "<URL>"
Then user enter her firstname as us "<FIRSTNAME>"
And user enter the lastname as us "<LASTNAME>"
Then user enter the emailId as us "<EMAILID>"
And user enter the mobileno as us "<MOBILENO>"
Then user enter the companyname as us "<COMPANYNAME>"
And user enter the address as us "<ADDRESS>"
When user enter the streetaddress as us "<STREETADDRESS>"
And user enter the cityname as us "<CITYNAME>"
Then user enter the statename as us "<STATENAME>"
And user enter the postcode as us "<POSTCODE>" 
Then user click how to select as us "<SELECT>"
 
Examples: 
|BROWSER     |  URL                              |FIRSTNAME |LASTNAME|EMAILID    |MOBILENO|COMPANYNAME|ADDRESS   |STREETADDRESS|CITYNAME   |STATENAME|POSTCODE|SELECT|
|Chromedriver|https://phptravels.org/register.php|Karuna    |karan   |karunaeee  |9600    |Vmentry    |chrompet  |Adyar        |Velupuram  |Tamilnadu|600230  |Bing  |
|Chromedriver|https://phptravels.org/register.php|Chandra   |Mani    |karunaesd  |9865    |Vcentry    |Vandalur  |Thiruvamiyur |Chengalpadu|Tamilnadu|600004  |Other |
|Chromedriver|https://phptravels.org/register.php|Karunak   |Kali    |kaliyappenk|8827    |Vsentry    |Goldanflat|sollinanalur |Thiruchy   |Tamilnadu|600048  |Google|