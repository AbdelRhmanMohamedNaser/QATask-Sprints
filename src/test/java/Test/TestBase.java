package Test;

import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class TestBase {
    HomePage home;
    public  static WebDriver driver;
    @BeforeSuite
    @Parameters({"browser","URL", "username", "password"})
    public void setup(@Optional("edge") String browser,
                      @Optional("https://egyptlaptop.com/") String URL,
                      @Optional("abdonasr502@gmail.com") String username,
                      @Optional("Abdo123@") String password)  {
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }
        else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            //System.setProperty("webdriver.firfox.driver","src/main/resources/geckodriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();

        }


        home = new HomePage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(URL);
        home.NavigateToLoginPage();
        //login
        login(username, password);
    }

    public void login(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userLogin(username, password);
    }
    @AfterSuite
    public void CloseDriver()  {
        driver.quit();
    }


}
