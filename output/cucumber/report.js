$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HMPortal.feature");
formatter.feature({
  "line": 2,
  "name": "Login into HM Portal and Perform Automate Regression",
  "description": "Login into HM Portal and Perform Automate Regression",
  "id": "login-into-hm-portal-and-perform-automate-regression",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@runall"
    }
  ]
});
formatter.before({
  "duration": 23153647810,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User navigates to harvestmark portal",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters the username as \"dev@yottamark.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters the passord as \"bbb123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "HMPortalSteps.user_navigates_to_harvestmark_portal()"
});
formatter.result({
  "duration": 11887842922,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dev@yottamark.com",
      "offset": 29
    }
  ],
  "location": "HMPortalSteps.user_enters_the_admin_username(String)"
});
formatter.result({
  "duration": 1551224509,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bbb123",
      "offset": 28
    }
  ],
  "location": "HMPortalSteps.user_enters_the_admin_password(String)"
});
formatter.result({
  "duration": 699089909,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.user_clicks_on_the_sign_in_button()"
});
formatter.result({
  "duration": 4920104802,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.user_should_be_taken_to_the_successful_login_page()"
});
formatter.result({
  "duration": 2472731915,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify all the links on the Insights page",
  "description": "",
  "id": "login-into-hm-portal-and-perform-automate-regression;verify-all-the-links-on-the-insights-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@insightslinks"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I click on Insights Link",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I click on Markets link",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I click on Ratings Link",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I click on Containers Link",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I click on Devices Link",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I click on Programs Link",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 37,
      "value": "#Then I click on Specification Management Link"
    }
  ],
  "line": 38,
  "name": "I click on Insights Products Link",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I click on Locations Link",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "I click on DC Inspection Link",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "I click on Uploads Link",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "I click on Watched Products Link",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "I click on Edit Inspections Link",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "I click on Supplier Contacts Link",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "I click on Inspection Minimums Link",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "I click on Notification Template Manager Link",
  "keyword": "Then "
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Insights_Link()"
});
formatter.result({
  "duration": 11135060346,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Markets_link()"
});
formatter.result({
  "duration": 8965472481,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Ratings_Link()"
});
formatter.result({
  "duration": 8978820252,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Containers_Link()"
});
formatter.result({
  "duration": 9727134189,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Devices_Link()"
});
formatter.result({
  "duration": 9381141082,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Programs_Link()"
});
formatter.result({
  "duration": 8617592246,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Insights_Products_Link()"
});
formatter.result({
  "duration": 7028711353,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Locations_Link()"
});
formatter.result({
  "duration": 6040746303,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_DC_Inspection_Link()"
});
formatter.result({
  "duration": 7260926591,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Uploads_Link()"
});
formatter.result({
  "duration": 4420743560,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Watched_Products_Link()"
});
formatter.result({
  "duration": 6648360926,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Edit_Inspections_Link()"
});
formatter.result({
  "duration": 8817952092,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Supplier_Contacts_Link()"
});
formatter.result({
  "duration": 10309148569,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Inspection_Minimums_Link()"
});
formatter.result({
  "duration": 16521676369,
  "status": "passed"
});
formatter.match({
  "location": "HMPortalSteps.i_click_on_Notification_Template_Manager_Link()"
});
formatter.result({
  "duration": 10901310137,
  "status": "passed"
});
formatter.after({
  "duration": 4859476515,
  "status": "passed"
});
});