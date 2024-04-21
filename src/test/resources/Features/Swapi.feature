Feature: Display and Select Star Wars Movies

  @E2E
  Scenario: Get the list of movies and check if the movies count is 6
   When the user validates that the total number of movies returned is "6"

  @E2E
  Scenario: Get the 3rd movie and check if the director of the movie is Richard Marquand
    When user validates that the movie with id 3 has "Richard Marquand" as a director

  @E2E
  Scenario: Get the 5th movie and assert that Producers are not Gary Kurtz and George Lucas
    When user validates that the movie with id 5 does not have "Gary Kurtz,George Lucas" as a Producer