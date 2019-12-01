Feature: Registration Feature
  Verify if the user is able to register to the site

  Scenario: Register with the new credentials
    Given the user is on the home page "http://demowebshop.tricentis.com"
    When user navigates to the registration page
    And user adds all the required details
    Then the registration is successful
