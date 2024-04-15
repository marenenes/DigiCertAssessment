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
        boolean succes = false;
        try {
            Home = new HomePage(SeleniumUtility.driver);
            succes = Home.Validate_Landing();
            Assert.assertTrue(succes);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Given("I launch browser")
    public void iLaunchBrowser() {
        try
        {
            SeleniumUtility.LaunchBrowser();
        }catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @When("I click the {string}")
    public void iClickThe(String arg0) {
        try
        {
            Home.Click_title(arg0);
        }catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Then("I validate the last movie is {string}")
    public void iValidateTheLastMovieIs(String arg0) {
        boolean succes = false;
        try {

            succes =Home.Validate_MovieTitle(arg0);
            Assert.assertTrue(succes);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @And("I click the required movie {string}")
    public void iClickTheRequiredMovie(String arg0) {
        try
        {
            Home.Click_RequiredMovie(arg0);
        }catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Then("I validate if Species section list has {string}")
    public void iValidateIfSpeciesSectionListHas(String arg0) {
        boolean succes = false;
        try {
            Movie = new MovieDetailPage(SeleniumUtility.driver);
            succes =Movie.Validate_Specie(arg0);
            Assert.assertTrue(succes);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @And("I validate if Planets section list has {string}")
    public void iValidateIfPlanetsSectionListHas(String arg0) {
        boolean succes = false;
        try {
            Movie = new MovieDetailPage(SeleniumUtility.driver);
            succes =Movie.Validate_Planets(arg0);
            Assert.assertFalse(succes);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
