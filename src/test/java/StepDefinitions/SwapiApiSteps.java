package StepDefinitions;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.When;
import org.junit.Assert;
import services.swapi.MovieService;


public class SwapiApiSteps {

    @When("the user validates that the total number of movies returned is {string}")
    public void userValidateThatTheTotalNumberOfMoviesReturnedIs(String arg0) throws JsonProcessingException {
        MovieService movies = new MovieService();
        Assert.assertTrue(movies.Validate_MovieCount(arg0));
    }
    @When("user validates that the movie with id {int} has {string} as a director")
    public void userValidatesThatMovieWithIdHasAsADirector(int arg0, String arg1) throws JsonProcessingException {
        MovieService movies = new MovieService();
        Assert.assertTrue(movies.Validate_DirectorName(arg1,arg0));
    }

    @When("user validates that the movie with id {int} does not have {string} as a Producer")
    public void userValidatesThatTheMovieWithIdDoesNotHaveAsAProducer(int arg0, String arg1) throws JsonProcessingException {
        MovieService movies = new MovieService();
        Assert.assertTrue(movies.Validate_ProducerNames(arg1, arg0));
    }
}
