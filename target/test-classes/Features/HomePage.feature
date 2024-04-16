Feature: Display and Select Star Wars Movies
  @E2E
  Scenario: Validate The Empire Strikes Back movie Species list has Wookie
    Given I launch browser
    And   I navigate to home
    And   I click the required movie "The Empire Strikes Back"
    Then  I validate if Species section list has "Wookie"
  @E2E
  Scenario: Validate Movies are sorted by Ascending alphabetical order
    Given I launch browser
    And   I navigate to home
    When  I click the "Title"
    Then  I validate the last movie is "The Phantom Menace"
  @E2E
  Scenario: Validate The The Phantom Menace movie Planets list has Camino
    Given I launch browser
    And   I navigate to home
    And   I click the required movie "The Phantom Menace"
    And   I validate if Planets section list has "Camino"