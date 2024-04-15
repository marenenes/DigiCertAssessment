package utility;

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
        String chromedriverPath= props.getProperty("ChromeDriverPath");
        System.setProperty("webdriver.chrome.driver",chromedriverPath);

        ChromeOptions options=new ChromeOptions();
        switch (browser)
        {
            case "Chrome":
                driver= new ChromeDriver();
                driver.get(Url);
                break;
            case "Firefox":
                driver= new FirefoxDriver();
                break;
        }

    }

    public static void BrowserClose()
    {
        driver.quit();
    }
}
