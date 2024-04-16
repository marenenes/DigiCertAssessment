package StepDefinitions;
import io.cucumber.java.en.When;
import org.junit.Assert;
import services.swapi.MovieService;


public class SwapiApiSteps {
    @When("user validate the movie the movie count is {string}")
    public void userValidateTheMovieTheMovieCountIs(String arg0) {
        boolean succes = false;
        try {

            MovieService movies = new MovieService();
            succes = movies.Validate_MovieCount(arg0);
            Assert.assertTrue(succes);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @When("user validates Director name of director number {int} is {string}")
    public void userValidatesDirectorNameOfDirectorNumberIs(int arg0, String arg1) {
        boolean succes = false;
        try {
            MovieService movies = new MovieService();
            succes = movies.Validate_DirectorName(arg1,arg0);
            Assert.assertTrue(succes);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @When("user validates producer name of director number {int} is {string}")
    public void userValidatesProducerNameOfDirectorNumberIs(int arg0, String arg1) {
        boolean succes = false;
        try {
            MovieService movies = new MovieService();
            succes = movies.Validate_ProducerNames(arg1,arg0);
            Assert.assertTrue(succes);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
