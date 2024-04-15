package pageobjects.DigiCertWebTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pageobjects.PageBase;
import java.util.List;

public class MovieDetailPage extends PageBase {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//h1[text()='Species']")
    WebElement SpecieHeadingText;

    @FindBy(how = How.XPATH, using = "//h1[text()='Planets']")
    WebElement PlanetsHeadingText;

    @FindBy(how = How.XPATH, using = "//h1[text()='Species']//..//..//li")
    List<WebElement> SpeciesList;

    @FindBy(how = How.XPATH, using = "//h1[text()='Planets']//..//..//li")
    List<WebElement> PlanetList;

    public MovieDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean Validate_Specie(String searchFor ) {
        WaitForElement(SpecieHeadingText);
        for (WebElement Specie : SpeciesList) {
            if (Specie.getText().equals(searchFor)) {
                return true;
            }
        }
        return false;
    }

    public boolean Validate_Planets(String searchFor ) {
        WaitForElement(PlanetsHeadingText);
        for (WebElement Specie : PlanetList) {
            if (Specie.getText().equals(searchFor)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected boolean Validate_Landing() {
        return WaitForElement(SpecieHeadingText);
    }
}
