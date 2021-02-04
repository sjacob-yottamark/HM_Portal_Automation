Feature: Harvestmark Portal Login and check all Company links
	
@HM_Portal 
Scenario: Harvestmark Portal Login and check all Company links

Given User navigates to harvestmark portal
Then User enters the username as "dev@yottamark.com"
Then User enters the passord as "bbb123"
Then User clicks on the sign in button
Then User should be taken to the successful login page

Then I click on Companies Link 
Then I click on Code Explorer Link
Then I click on Tim Explorer Link
Then I click on Block Chain Link
Then I click on Form Submission Link
Then I click on My Forms Link
Then I click on My Reports Link
Then I click on Batches Link
#Then I click on GTIN Manager Link
Then I click on PTI Link
Then I click on Settings Link
Then I click on Insights Link

Then I click on Markets link
Then I click on Ratings Link
Then I click on Containers Link
Then I click on Devices Link
Then I click on Programs Link
#Then I click on Specification Management Link
Then I click on Insights Products Link
Then I click on Locations Link
Then I click on DC Inspection Link
Then I click on Uploads Link
Then I click on Watched Products Link
Then I click on Edit Inspections Link
Then I click on Supplier Contacts Link
Then I click on Inspection Minimums Link
Then I click on Notification Template Manager Link


	