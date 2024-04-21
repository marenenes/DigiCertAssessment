package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;

import static utility.ConfigUtils.props;

public class SeleniumUtility {
    public  static WebDriver driver;
    public static void LaunchBrowser() throws MalformedURLException {
        String browser = props.getProperty("Browser");
        String Url = props.getProperty("Url");
        String SeleniumGridUrl = props.getProperty("SeleniumGridUrl");


        if ((props.getProperty("SeleniumGrid").equals("true"))) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.setAcceptInsecureCerts(true);
            driver = new RemoteWebDriver(new URL(SeleniumGridUrl), options);
            driver.get(Url);
        } else {
            switch (browser) {

                case "Chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    driver = new ChromeDriver(options);
                    driver.get(Url);
                    break;
                case "Firefox":
                    WebDriverManager.chromedriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }

        }
    }
    public static void BrowserClose()
    {
        if (driver!=null)
            driver.quit();
    }
}
