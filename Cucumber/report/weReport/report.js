$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefile/php.feature");
formatter.feature({
  "line": 2,
  "name": "Validate php travels registor page",
  "description": "",
  "id": "validate-php-travels-registor-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate php travels registor page with valid data",
  "description": "",
  "id": "validate-php-travels-registor-page;validate-php-travels-registor-page-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open browser as chromdriver",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter url",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enter firstname",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter lastname",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter emailid",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enter mobileno",
  "keyword": "Then "
});
formatter.match({
  "location": "PhpTest.user_open_browser_as_chromdriver()"
});
formatter.result({
  "duration": 2329506390,
  "status": "passed"
});
formatter.match({
  "location": "PhpTest.user_enter_enter_url()"
});
formatter.result({
  "duration": 11855028539,
  "status": "passed"
});
formatter.match({
  "location": "PhpTest.user_enter_firstname()"
});
formatter.result({
  "duration": 204927653,
  "status": "passed"
});
formatter.match({
  "location": "PhpTest.user_enter_lastname()"
});
formatter.result({
  "duration": 134343722,
  "status": "passed"
});
formatter.match({
  "location": "PhpTest.user_enter_emailid()"
});
formatter.result({
  "duration": 154103117,
  "status": "passed"
});
formatter.match({
  "location": "PhpTest.user_enter_mobileno()"
});
formatter.result({
  "duration": 134964373,
  "status": "passed"
});
});