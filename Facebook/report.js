$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/facebook.feature");
formatter.feature({
  "name": "Verify Login functionality in Facebook Application.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Login functionality for valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "verify the user is on facebook login page.",
  "keyword": "Given "
});
formatter.step({
  "name": "users enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "error page is didplayed.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "user1",
        "Test1234"
      ]
    },
    {
      "cells": [
        "user2",
        "Test4678"
      ]
    },
    {
      "cells": [
        "user3",
        "Test1122"
      ]
    },
    {
      "cells": [
        "user4",
        "Test2233"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Login functionality for valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "verify the user is on facebook login page.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.verify_the_user_is_on_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters \"user1\" and \"Test1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.users_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error page is didplayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.error_page_is_didplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login functionality for valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "verify the user is on facebook login page.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.verify_the_user_is_on_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters \"user2\" and \"Test4678\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.users_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error page is didplayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.error_page_is_didplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login functionality for valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "verify the user is on facebook login page.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.verify_the_user_is_on_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters \"user3\" and \"Test1122\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.users_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error page is didplayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.error_page_is_didplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login functionality for valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "verify the user is on facebook login page.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.verify_the_user_is_on_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters \"user4\" and \"Test2233\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.users_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error page is didplayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.error_page_is_didplayed()"
});
formatter.result({
  "status": "passed"
});
});