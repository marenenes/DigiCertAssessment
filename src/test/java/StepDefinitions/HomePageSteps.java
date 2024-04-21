package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.DigiCertWebTest.HomePage;
import pageobjects.DigiCertWebTest.MovieDetailPage;
import utility.SeleniumUtility;

public class HomePageSteps  {
    HomePage Home;
    MovieDetailPage Movie;
    @Given("I navigate to home")
    public void iNavigateToHome() {
        Home = new HomePage(SeleniumUtility.driver);
        Assert.assertTrue(Home.Validate_Landing());
    }

    @Given("I launch browser")
    public void iLaunchBrowser() {
            SeleniumUtility.LaunchBrowser();
    }

    @When("I click the {string}")
    public void iClickThe(String arg0) {
            Home.Click_title(arg0);
    }

    @Then("I validate the last movie is {string}")
    public void iValidateTheLastMovieIs(String arg0) {
            Assert.assertTrue(Home.Validate_MovieTitle(arg0));
    }

    @And("I click the required movie {string}")
    public void iClickTheRequiredMovie(String arg0) {
            Home.Click_RequiredMovie(arg0);
    }

    @Then("I validate if Species section list has {string}")
    public void iValidateIfSpeciesSectionListHas(String arg0) {
            Movie = new MovieDetailPage(SeleniumUtility.driver);
            Assert.assertTrue(Movie.Validate_Specie(arg0));
    }

    @And("I validate if Planets section list has {string}")
    public void iValidateIfPlanetsSectionListHas(String arg0) {
            Movie = new MovieDetailPage(SeleniumUtility.driver);
            Assert.assertFalse(Movie.Validate_Planets(arg0));
    }
}
