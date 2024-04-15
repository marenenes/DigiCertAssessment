package StepDefinitions;
import io.cucumber.java.*;
import utility.ConfigUtils;
import utility.SeleniumUtility;

public class Hooks {

    @Before
    public void Before() {
        ConfigUtils.LoadProperties();
    }

    @After
    public void Cleanup() {
        SeleniumUtility.BrowserClose();
    }
}
