$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping cart on an e-commerce website",
  "description": "",
  "id": "shopping-cart-on-an-e-commerce-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Sign in and sign out",
  "description": "",
  "id": "shopping-cart-on-an-e-commerce-website;sign-in-and-sign-out",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I open automationpractice website",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "I sign in",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I check megamenu",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Sort Summer dresses",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I sign out",
  "keyword": "Then "
});
formatter.match({
  "location": "OnlineShopping.i_open_automationpractice_website()"
});
formatter.result({
  "duration": 10179895673,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShopping.i_sign_in()"
});
formatter.result({
  "duration": 3244243307,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShopping.i_check_megamenu()"
});
formatter.result({
  "duration": 2700398699,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShopping.sort_Summer_dresses()"
});
formatter.result({
  "duration": 5661268603,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShopping.i_sign_out()"
});
formatter.result({
  "duration": 35174,
  "status": "passed"
});
});