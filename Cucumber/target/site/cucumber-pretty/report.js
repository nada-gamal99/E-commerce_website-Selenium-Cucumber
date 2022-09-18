$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/CreateNewAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Create new account",
  "description": "",
  "id": "create-new-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Creating a new account with unique email",
  "description": "",
  "id": "create-new-account;creating-a-new-account-with-unique-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the user is on the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user enters an email that does not previously registered with",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user enters a registration form",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the user should be registered successfully",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "Creating a new account with pre-registered email",
  "description": "",
  "id": "create-new-account;creating-a-new-account-with-pre-registered-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "the user is on the website",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "the user enters a pre-registered email",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "an error message must appear",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});