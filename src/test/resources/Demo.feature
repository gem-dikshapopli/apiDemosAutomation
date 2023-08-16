@test1
Feature: ApiDemo Features

Feature: ApiDemo App Actions

  Scenario: Opening ApiDemo Application
    Given the ApiDemo application is open

  Scenario: Scroll Down to SetWallpaper Option and Set the Wallpaper
    Given the user Scroll down to Set Wallpaper Option and Sets the wallpaper

  Scenario: Drag The Ball and Drop the ball
    When the user go back and Scroll down to Views Option and then select dragAndDrop Option
    Then the user drags and drops elements successfully

  Scenario: Double Tap Action
    When the user performs a double tap action by clicking on Next button
    Then the user experiences a double tap effect as the count of clicking is increased by 2

  Scenario: Swipe Right The Button
    When the User performs scroll up Action
    When the user performs a swipe right action
    When the user performs a swipe left action
    Then the swipe action is successful
