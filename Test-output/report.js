$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Assignment1.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Facebook and post a status message \"Hello World\"",
  "description": "",
  "id": "login-to-facebook-and-post-a-status-message-\"hello-world\"",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login to facebook and post hello world message",
  "description": "",
  "id": "login-to-facebook-and-post-a-status-message-\"hello-world\";login-to-facebook-and-post-hello-world-message",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@assignment1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch the \u003cbrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I pass the \u003cURL\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter \u003cuname\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should land on homepage and enter \u003cpost\u003e in the create post section",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on share button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I see post has been created successfully",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login-to-facebook-and-post-a-status-message-\"hello-world\";login-to-facebook-and-post-hello-world-message;",
  "rows": [
    {
      "cells": [
        "browser",
        "URL",
        "uname",
        "password",
        "post"
      ],
      "line": 15,
      "id": "login-to-facebook-and-post-a-status-message-\"hello-world\";login-to-facebook-and-post-hello-world-message;;1"
    },
    {
      "cells": [
        "chrome",
        "https://www.facebook.com/",
        "hemakumar.1986@gmail.com",
        "abcdef12345",
        "Hello_World"
      ],
      "line": 16,
      "id": "login-to-facebook-and-post-a-status-message-\"hello-world\";login-to-facebook-and-post-hello-world-message;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Login to facebook and post hello world message",
  "description": "",
  "id": "login-to-facebook-and-post-a-status-message-\"hello-world\";login-to-facebook-and-post-hello-world-message;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@assignment1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch the chrome",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I pass the https://www.facebook.com/",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter hemakumar.1986@gmail.com and abcdef12345",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should land on homepage and enter Hello_World in the create post section",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on share button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I see post has been created successfully",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 13
    }
  ],
  "location": "FacebookLoginScreen.I_launch_the_browser(String)"
});
formatter.result({
  "duration": 3083276518,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.facebook.com/",
      "offset": 11
    }
  ],
  "location": "FacebookLoginScreen.I_pass_the_URL(String)"
});
formatter.result({
  "duration": 13192883277,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hemakumar.1986@gmail.com",
      "offset": 8
    },
    {
      "val": "abcdef12345",
      "offset": 37
    }
  ],
  "location": "FacebookLoginScreen.I_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 1141398605,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginScreen.I_click_on_login()"
});
formatter.result({
  "duration": 190989412984,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello_World",
      "offset": 36
    }
  ],
  "location": "FacebookLoginScreen.I_should_land_on_homepage_and_enter_hello_world_in_Create_post_Section(String)"
});
formatter.result({
  "duration": 1535038696,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginScreen.I_should_click_on_Share_button()"
});
formatter.result({
  "duration": 74851,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginScreen.I_see_post_has_been_created_successfully()"
});
formatter.result({
  "duration": 72285,
  "status": "passed"
});
});