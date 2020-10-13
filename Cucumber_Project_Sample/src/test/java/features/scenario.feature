Feature: Brandintelle testing
Scenario: Check for the import Estimate
  Given launch the URL
  When Login with valid username: "Sanyuktaa" and Password: "Tt@123456"
  Then click on login button and user will be on dashboard
  And Search and Open the Application : "Estimate"
  Then Select import from Estimate module
  Then Logout the application
   