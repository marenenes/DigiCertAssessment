package pageobjects.DigiCertWebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pageobjects.PageBase;
import utility.Helpers;
import java.util.*;

public class HomePage extends PageBase {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//th[text()='Title']")
    WebElement homeText;

    @FindBy(how = How.XPATH, using = "//table//tbody/tr/td[1]")
    List<WebElement> Titles;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean Validate_MovieTitle(String moviesTitles)
    {
        ArrayList<String> List = new ArrayList<String>();
        for (WebElement title : Titles) {
            WaitForElement(title);
            List.add(title.getText());
        }
        boolean sortedAscending= Helpers.IsAscendingAlphabeticalOrder(List);
        return sortedAscending && moviesTitles.equals(List.getLast());
    }

    public void Click_RequiredMovie(String movie2Select) {

        for (WebElement title : Titles) {
            if (title.getText().equals(movie2Select)) {
                title.click();
                break;
            }
        }
    }
    public void Click_title(String column) {
        driver.findElement(By.xpath("//th[text()='" + column + "']")).click();
    }
    @Override
    public boolean Validate_Landing() {
       return WaitForElement(homeText);
    }
}
