Feature: Display and Select Star Wars Movies

  @E2E
  Scenario: Get the list of movies and check if the movies count is 6
   When user validate the movie the movie count is "6"

  @E2E
  Scenario: Get the 3rd movie and check if the director of the movie is Richard Marquand
    When user validates Director name of director number 3 is "Richard Marquand"

  @E2E
  Scenario: Get the 5th movie and assert that Producers are not Gary Kurtz and George Lucas
    When user validates producer name of director number 5 is "Gary Kurtz,George Lucas"