Feature: feature to test login functionality

  @TEST-1
  Scenario: Login
    Given The user is on login volam truyen ky page
    When The user enters name "Chinh Nguyen" and password "Doilathe12!" on login volam truyen ky page
    When The user clicks button login on login volam truyen ky page
    Then The user is on home page