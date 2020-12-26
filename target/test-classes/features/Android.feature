Feature: Android
  @Wifi
  Scenario: Change WiFi Settings
    Given click preference button
    And click Preference Dependencies
    And click checkbox
    And click WiFi settings
    And enter "Appium Testing"
    Then click ok button

