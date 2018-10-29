package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    private static WebDriver driver;
    private static final String URL = "http://www.nbp.pl/home.aspx?f=/kursy/kursya.html";
    private static ChromeOptions options;

    private DriverManager() {

    }

    public static WebDriver getWebDriver() {

        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver(hideWebBrowser());
        }
        return driver;
    }

    private static ChromeOptions hideWebBrowser() {
        options = new ChromeOptions();
        options.addArguments("--headless");
        return options;
    }

    public static void configureAndNavigate() {
        driver = DriverManager.getWebDriver();
        driver.navigate().to(URL);
    }

    public static void disposeDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }

}
