package pageobjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static utility.SeleniumUtility.driver;

public abstract class PageBase {
    protected abstract boolean Validate_Landing();
    public boolean WaitForElement(WebElement elem) {
        try{
            WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                    .until(ExpectedConditions.visibilityOf(elem));
        }
        catch(TimeoutException exception) {
            return false;
        }
        return true;
    }
}
