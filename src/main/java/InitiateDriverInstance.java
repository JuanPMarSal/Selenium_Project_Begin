import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Util;


public class InitiateDriverInstance {
    public WebDriver driver;

    @BeforeMethod
    public void initiateDriverInstance() throws Exception {
        switch (Util.fetchPropertiesValues("BrowserName").toString().toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                throw new Exception("Incorrect Browser");
        }
        driver.get((String) Util.fetchPropertiesValues("ApplicationURL"));
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void closeDriverInstance() {
        driver.quit();
    }
    /* Cross Browsing
     */
}
