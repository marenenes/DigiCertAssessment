package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import static utility.ConfigUtils.props;

public class SeleniumUtility {
    public  static WebDriver driver;
    public static void LaunchBrowser()
    {
        String browser= props.getProperty("Browser");
        String Url= props.getProperty("Url");

        switch (browser)
        {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                driver.get(Url);
                break;
            case "Firefox":
                WebDriverManager.chromedriver().setup();
                driver= new FirefoxDriver();
                break;
        }

    }

    public static void BrowserClose()
    {
        if (driver!=null)
            driver.quit();
    }
}
